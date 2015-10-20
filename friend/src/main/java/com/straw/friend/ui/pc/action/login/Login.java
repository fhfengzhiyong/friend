package com.straw.friend.ui.pc.action.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class Login {
	@RequestMapping(value="/login")
    public String login(HttpServletRequest request,Model model){
    	return "/pc/login/login";
    }
}
