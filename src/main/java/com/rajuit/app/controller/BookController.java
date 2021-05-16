package com.rajuit.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajuit.app.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	@RequestMapping(value="/findPriceById")
	public String getPriceById(@RequestParam("bookId") String bookId,Model model) {
		
		Double price=bookService.findBookById(bookId);
		model.addAttribute("price", "Book Price is :: "+price);
		
		return "display";
	}
}
