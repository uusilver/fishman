package com.tmind.fishman.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tmind.fishman.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * 
 */
@Controller
@RequestMapping("/login.do")
public class LoginController {

	// Standard JSR250 Injection
    Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(params = "weblogin")
	public ModelAndView login(@ModelAttribute("user") User user,
			HttpServletRequest req, HttpServletResponse response) {
        log.info(user.getUserId());
		// 传递对象于下一页面
		// TODO check database to get user, for now just use 'admin' 'admin' for
		// mock
        ModelMap model = new ModelMap();
        model.addAttribute("userId", user.getUserId());
		return new ModelAndView("CreateRoom", model);
	}


}
