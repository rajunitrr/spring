package com.rajuit.app.exceptions;

public class NoBookFoundException extends RuntimeException {

	private static final long serialVersionUID = 6149089579049676859L;

	public NoBookFoundException(String msg) {
		super(msg);
	}
}
