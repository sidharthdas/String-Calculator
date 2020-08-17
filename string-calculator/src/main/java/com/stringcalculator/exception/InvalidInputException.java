package com.stringcalculator.exception;

public class InvalidInputException extends Exception{
	
	private String errMsg;
	
	public InvalidInputException(String errMsg) {
		this.errMsg = errMsg;
	}
	
	public String getErrorMessage() {
		return this.errMsg;
	}

}
