package com.straw.friend.controller;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.straw.friend.bean.Circle;
import com.straw.friend.bean.CircleUser;
import com.straw.friend.bean.User;
import com.straw.friend.dao.ICircleUserDao;
import com.straw.friend.service.ICircleService;
import com.straw.friend.service.ICircleUserService;
@Controller
@RequestMapping("/circle")
public class CircleController extends BaseController{
   @Resource
   ICircleService circleService;
   @Resource
   ICircleUserService circleUserService;
   @ResponseBody
   @RequestMapping(value="/add")  
   public int add(HttpServletRequest request,Model model){  
	   String name = request.getParameter("name");
	   String password = request.getParameter("password");
	   String content = request.getParameter("content");
	   String usreId = request.getParameter("usreId");
	   Circle circle = new Circle();
	   circle.setCreater(usreId);
	   circle.setContent(content);
	   circle.setPassword(password);
	   circle.setName(name);
	   circle.setAccount(RandomUtils.nextInt());
       int i = this.circleService.insert(circle);
       if(i > 0){
    	   CircleUser circleUser = new CircleUser();
    	   circleUser.setCircleid(circle.getId());
    	   circleUser.setUserid(name);
    	   circleUserService.add(circleUser);
       }
       return i;  
   } 
   @ResponseBody
   @RequestMapping(value="/findbyid")  
   public Circle findbyid(HttpServletRequest request,Model model){  
	   String id = request.getParameter("id");
	   Circle circle = this.circleService.findbyid(id);
       return circle;  
   }
	/**
	 * 返回圈子没有该用户
	 * @param request
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findCircleNoByUserId")
	public Map findCircleNoByUserId(HttpServletRequest request,
			Model model) {
		String userId = request.getParameter("userId");
		System.out.println("请求未加入的圈子列表:"+userId);
		List<Circle> circleUserList = this.circleService
				.findCircleNoByUserId(userId);
		map.put("content", circleUserList);
		return map;
	}
}
