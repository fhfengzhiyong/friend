package com.straw.friend.controller;

import java.io.File;
import java.util.Map;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.straw.friend.bean.User;
import com.straw.friend.service.IUserService;
  

@Controller  
@RequestMapping("/user")  
public class UserController extends BaseController{  
    @Resource  
    private IUserService userService;  
    /**
     * 查询用户
     * @param request
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/showUser")  
    public User showUser(HttpServletRequest request,Model model){  
        String deviceId = request.getParameter("deviceId");
        User user = this.userService.getUserByDeviceId(deviceId);
        return user;  
    } 
    /**
     * 查询用户
     * @param request
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/add")  
    public Map add(HttpServletRequest request,Model model){  
       // User user = new User(); 
        String deviceid = request.getParameter("deviceid");
        String name = request.getParameter("name");
        User userById = userService.getUserByDeviceId(deviceid);
        int i ;
        if(userById == null){
        	userById = new User();
        	userById.setDeviceid(deviceid);
        	userById.setName(name);
        	 i = this.userService.insertSelective(userById);
        }else{
        	userById.setName(name);
        	i = userService.updateByPrimaryKey(userById);
        }
        map.put("content", i);
        return map;  
    } 
    /**
     * 修改用户名
     * @param request
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/update")  
    public int update(HttpServletRequest request,Model model){  
    	String id = request.getParameter("id");
        User user = this.userService.getUserById(id);
        String name = request.getParameter("name");
        user.setName(name);
        int i = this.userService.updateByPrimaryKey(user);
        return i;  
    } 
    @ResponseBody
    @RequestMapping(value="/addImage")
    public int addImageUrl(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,Model model){
    	 System.out.println("开始");  
         String path = request.getSession().getServletContext().getRealPath("upload");  
         String fileName = file.getOriginalFilename();  
         System.out.println(path);  
         File targetFile = new File(path, fileName);  
         if(!targetFile.exists()){  
             targetFile.mkdirs();  
         }  
         //保存  
         try {  
             file.transferTo(targetFile);  
         } catch (Exception e) {  
             e.printStackTrace();  
         }  
         model.addAttribute("fileUrl", request.getContextPath()+"/upload/"+fileName);  
    	return 0;
    }
    
}