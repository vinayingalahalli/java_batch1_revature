package com.model;

public class Hello {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter called");
	}
	public Hello() {
		System.out.println("Constructor called");
	}
}
