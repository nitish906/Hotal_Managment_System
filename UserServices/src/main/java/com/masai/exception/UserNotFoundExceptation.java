package com.masai.exception;


public class UserNotFoundExceptation extends RuntimeException {
	
	public UserNotFoundExceptation(){
		super("User Not Found");
	}
	
	public UserNotFoundExceptation(String message) {
		super(message);
	}

}
