package com.straw.friend.filter;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.AccessControlFilter;

import com.alibaba.fastjson.JSON;

public class SysAccessControlFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(JSON.toJSON(request));
		//return true;
		System.out.println("通过了");
		return true;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void saveRequestAndRedirectToLogin(ServletRequest request,
			ServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		super.saveRequestAndRedirectToLogin(request, response);
	}
	
}
