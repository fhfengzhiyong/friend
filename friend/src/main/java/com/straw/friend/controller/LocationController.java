package com.straw.friend.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.straw.friend.bean.Location;
import com.straw.friend.bean.User;
import com.straw.friend.service.ILocationService;
@Controller
@RequestMapping("location")
public class LocationController {
	@Resource  
    ILocationService locationService;
	/**
     * 增加位置
     * @param request
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/add")  
    public int add(HttpServletRequest request,Model model){  
    	 String userId = request.getParameter("userId");
         String x = request.getParameter("x");
         String y = request.getParameter("y");
        Location location = new Location();
        location.setUserid(userId);
        location.setX(x);
        location.setY(y);
        int i = this.locationService.add(location);
        return i;  
    } 
    /**
     * 查询位置
     * @param request
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/findByUserId")  
    public Location findByUserId(HttpServletRequest request,Model model){  
    	 String deviceid = request.getParameter("deviceid");
        Location location = this.locationService.findByUserId(deviceid);
        return location;  
    } 
}
