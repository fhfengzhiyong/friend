package com.straw.friend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.straw.friend.bean.Circle;
import com.straw.friend.bean.CircleLocationReturn;
import com.straw.friend.bean.CircleUser;
import com.straw.friend.bean.Location;
import com.straw.friend.bean.User;
import com.straw.friend.service.ICircleService;
import com.straw.friend.service.ICircleUserService;
import com.straw.friend.service.ILocationService;
import com.straw.friend.service.IUserService;
@Controller
@RequestMapping("circleUser")
public class CircleUserController extends BaseController{
	@Resource
	ICircleUserService circleUserService;
	@Resource
    IUserService userService;
	@Resource
	ICircleService circleService;
	@Resource
	ILocationService locationService;
	@ResponseBody
	@RequestMapping(value = "/findCircleByUserId")
	public Map findCircleByUserId(HttpServletRequest request,
			Model model) {
		String deviceId = request.getParameter("deviceId");
		List<CircleUser> circleUserList = this.circleUserService
				.findCircleByUserId(deviceId);
		map.put("content", circleUserList);
		return map;
	}
	/**
	 * 根据圈子的id,查询出这个圈子的人和最后一次的地址.
	 * @param request
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findCircleUserByCircleId")
	public Map findCircleLocationReturn(HttpServletRequest request,
			Model model) {//f7421ddb-aa81-4821-b98e-c449ec38d48e
		String circleId = request.getParameter("circleId");
		List<CircleUser> circleUserList = this.circleUserService.findCircleByCircleId(circleId);
		List<CircleLocationReturn> list = new ArrayList<CircleLocationReturn>();
		if(circleUserList != null){
			for(int i=0;i<circleUserList.size();i++){
				CircleUser u = circleUserList.get(i);
				if(u == null){
					continue;
				}
				User user = userService.getUserByDeviceId(u.getUserid());
				CircleLocationReturn c = new CircleLocationReturn();
				if(user == null){
					continue;
				}
				Location location = locationService.findByUserId(user.getDeviceid());
				c.setName(user.getName());
				c.setX(location.getX());
				c.setY(location.getY());
				c.setCreatedate(location.getCreatedate());
				list.add(c);
			}
		}
		map.put("content", list);
		return map;
	}
	@ResponseBody
	@RequestMapping(value = "/findCircleByCircleId")
	public List<CircleUser> findCircleByCircleId(HttpServletRequest request,
			Model model) {
		String circleId = request.getParameter("circleId");
		List<CircleUser> circleUserList = this.circleUserService
				.findCircleByCircleId(circleId);
		return circleUserList;
	}

	@ResponseBody
	@RequestMapping(value = "/add")
	public int add(HttpServletRequest request, Model model) {
		String circleId = request.getParameter("circleId");
		String deviceId = request.getParameter("userId");
		String passString = request.getParameter("passString");
		System.out.println(circleId+"===="+deviceId+"===="+passString);
		int e = circleService.selectCircleByIdPd(circleId,passString);
		if(e>0){
			CircleUser circleUser = new CircleUser();
			circleUser.setCircleid(circleId);
			circleUser.setUserid(deviceId);
			e = circleUserService.add(circleUser);
		}
		return e;
	}
}
