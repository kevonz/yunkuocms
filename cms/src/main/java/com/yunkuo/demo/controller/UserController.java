package com.yunkuo.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yunkuo.demo.model.user.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value = "/login")
	public String test(HttpServletRequest request,
			HttpServletResponse response, User userinfo) { // 非常方便可以直接在方法里面放入对象
		if (userinfo.getUsername().equals("smf")
				&& userinfo.getPassword().equals("ok")) {
			request.setAttribute("userinfo", userinfo);
			return "users/loginok"; // 判断，将跳转不同的页面
		} else {
			return "users/loginerr"; // 判断，将跳转不同的页面
		}
	}
}
