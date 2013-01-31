package com.yunkuo.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yunkuo.demo.model.user.User;

@Controller
public class DefaultController {
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

	@RequestMapping("/user1")
	public String getUser1(ModelMap model){
		User user=new User();
		user.setUsername("getUser1");
		model.addAttribute("user", user);
		return "user";
	}
	
	@RequestMapping("/user2")
	public ModelAndView getUser2(){
		ModelAndView mv=new ModelAndView();
		User user=new User();
		user.setUsername("getUser2");
		mv.addObject(user);
		mv.setViewName("user");
		return mv;
	}
	

	
	@RequestMapping("/test")
	public String test(HttpServletRequest request,
			HttpServletResponse response,ModelMap model) {
		//ModelAndView mv=new ModelAndView();
		model.addAttribute("t", "vs");
		return "test";
	}

	@RequestMapping("/test2")
	public ModelAndView test2(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("t", "v2");		
		mv.setViewName("test");
		return mv;
	}

	@RequestMapping("/usertest")
	public ModelAndView usertest(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("t", "v");		
		return new ModelAndView("users/test");
	}

}
