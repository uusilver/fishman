package com.tmind.fishman.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tmind.fishman.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * 
 */
@Controller
@RequestMapping("/login.do")
public class LoginController {

	// Standard JSR250 Injection


	@RequestMapping(params = "weblogin")
	public String login(@ModelAttribute("user") User user,
			HttpServletRequest req, HttpServletResponse response) {
		System.out.println("用户信息: " + user);
		// 传递对象于下一页面
		// TODO check database to get user, for now just use 'admin' 'admin' for
		// mock

		return "login";
	}


}
