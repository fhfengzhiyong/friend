package com.straw.friend.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.straw.friend.bean.Joke;
import com.straw.friend.miipush.MiPush;
import com.straw.friend.service.IJokeService;
@Controller
@RequestMapping("/joke")
public class JokeController extends BaseController {
	@Resource
	private IJokeService jokeService;
    @ResponseBody
	@RequestMapping("/add")
	public int add(HttpServletRequest request, Model model) {
		Joke joke = new Joke();
		String content = request.getParameter("content");
		if(null == content){
			return 0;
		}
		joke.setUserid(request.getParameter("usreId"));
		joke.setTitle(request.getParameter("title"));
		joke.setContent( request.getParameter("content"));
		int i = jokeService.add(joke);
		try {
			MiPush.sendMessages("您有新段子!",content.substring(0, content.length()>10?10:content.length()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
    @ResponseBody
	@RequestMapping("delete")
	public int delete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		System.out.println("id ="+id);
		int i = jokeService.deleteById(id);
		return i;
	}
    @ResponseBody
	@RequestMapping("update")
	public int update(HttpServletRequest request, Model model) {
		String id = (String) request.getAttribute("id");
		String content = (String) request.getAttribute("content");
		Joke joke = jokeService.findById(id);
		joke.setContent(content);
		int i = jokeService.updateByPrimaryKey(joke);
		return i;
	}
    @ResponseBody
	@RequestMapping("findById")
	public Joke findById(HttpServletRequest request, Model model) {
		String id = (String) request.getAttribute("id");
		Joke joke = jokeService.findById(id);
		return joke;
	}
    @ResponseBody
	@RequestMapping("findList")
	public Map findList(HttpServletRequest request, Model model) {
		String id = (String) request.getAttribute("id");
		List<Joke> jokeList = jokeService.findList();
		map.put("content", jokeList);
		return map;
	}
}
