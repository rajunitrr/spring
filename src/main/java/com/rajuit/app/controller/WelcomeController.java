package com.rajuit.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", "Welcome to Web app");
		String name = null;
		name.length();
		return "welcome";
	}

	/*
	 * @ExceptionHandler(value = NullPointerException.class) public String
	 * handleNullPinterException(Model model) { model.addAttribute("errmsg",
	 * "Some Problem Occured .Please Try After Sometime"); return "error";
	 * 
	 * }
	 */
}
