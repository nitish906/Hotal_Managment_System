package com.masai.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
	
	
	
	private String message;
	private boolean success;
	private HttpStatus status;
	
	

}
