package com.talan.internship.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageResponse {

	private boolean succes;
	private String message;
	private String detail;
	
	
}
