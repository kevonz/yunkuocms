package com.yunkuo.cms.web.site.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

	@RequestMapping(value = "/index/test", method = RequestMethod.GET)
	public ModelAndView test(){
		ModelAndView mav=new ModelAndView();		
		return mav;
	}	
}
