package com.rajuit.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	@RequestMapping(value = "/dateDisplay")
	public String dateDisplay(Model model) {
		
		model.addAttribute("dateMsg", "Todays date:: "+new Date());
		String s=null;
		s.length();
		return "dateDisplay";
	}

}
