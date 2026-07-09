package com.ex1;

public class Hello {
	private String message;

	public Hello() {
		super();
		System.out.println("Default Constructor");
	}

	public Hello(String message) {
		super();
		this.message = message;
		System.out.println("Parameterized Constructor");

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
