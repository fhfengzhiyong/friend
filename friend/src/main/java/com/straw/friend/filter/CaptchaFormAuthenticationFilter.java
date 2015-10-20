package com.straw.friend.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.straw.friend.shiro.CaptchaUsernamePasswordToken;
import com.straw.friend.shiro.IncorrectCaptchaException;


public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {

	private static final Logger LOG = LoggerFactory
			.getLogger(CaptchaFormAuthenticationFilter.class);

	public CaptchaFormAuthenticationFilter() {
	}

	@Override
	protected boolean executeLogin(ServletRequest request,
			ServletResponse response) throws Exception {
		CaptchaUsernamePasswordToken token = createToken(request, response);
		try {
			doCaptchaValidate((HttpServletRequest) request, token);
			Subject subject = getSubject(request, response);
			subject.login(token);
			return onLoginSuccess(token, subject, request, response);
		} catch (AuthenticationException e) {
			LOG.info(token.getUsername() + "登录失败--" + e);
			return onLoginFailure(token, e, request, response);
		}
	}

	// 验证码校验
	protected void doCaptchaValidate(HttpServletRequest request,
			CaptchaUsernamePasswordToken token) {
		// session中的图形码字符串
		String captcha = (String) request.getSession().getAttribute(
				com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		// 比对
		if (captcha != null && !captcha.equalsIgnoreCase(token.getCaptcha())) {
			throw new IncorrectCaptchaException("验证码错误！");
		}
	}

	public static final String DEFAULT_CAPTCHA_PARAM = "captcha";
	private String captchaParam = DEFAULT_CAPTCHA_PARAM;

	@Override
	protected CaptchaUsernamePasswordToken createToken(ServletRequest request,
			ServletResponse response) {
		String username = getUsername(request);
		String password = getPassword(request);
		String captcha = getCaptcha(request);
		boolean rememberMe = isRememberMe(request);
		String host = getHost(request);
		return new CaptchaUsernamePasswordToken(username,
				password.toCharArray(), rememberMe, host, captcha);
	}

	protected String getCaptcha(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCaptchaParam());
	}

	public String getCaptchaParam() {
		return captchaParam;
	}
	//保存异常对象到request  
    @Override  
    protected void setFailureAttribute(ServletRequest request,  
            AuthenticationException ae) {  
        request.setAttribute(getFailureKeyAttribute(), ae);  
    } 

}
