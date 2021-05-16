package com.rajuit.app.service;

import org.springframework.stereotype.Service;

import com.rajuit.app.exceptions.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public double findBookById(String bookId) {

		if (bookId.equals("B01")) {
			return 500.50;
		} else {
			throw new NoBookFoundException("No Book Found of " + bookId);
		}

	}

}
