package com.masai.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.masai.payload.ApiResponse;

@RestControllerAdvice
public class GlobleExceptationHandler {
	
	public ResponseEntity<ApiResponse>userNotFoundExceptation(){
		return null;
		
	}

}
