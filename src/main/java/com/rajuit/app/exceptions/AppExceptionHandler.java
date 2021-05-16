package com.rajuit.app.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		model.addAttribute("errmsg", "Please try again after someTime!!");
		return "error";
	}
	
	@ExceptionHandler(value = NoBookFoundException.class)
	public String handleNoBookFoundException(Model model) {
		model.addAttribute("errmsg", "NoBookFoundException "+model.getAttribute("price	"));
		return "error";
	}
}
