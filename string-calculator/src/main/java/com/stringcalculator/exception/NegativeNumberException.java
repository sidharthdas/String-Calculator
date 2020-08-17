package com.stringcalculator.exception;

public class NegativeNumberException extends Exception{
	
	private String erroMsg;
	
	public NegativeNumberException(String erroMsg) {
		this.erroMsg = erroMsg;
	}
	
	public String getErrorMessage() {
		return erroMsg;
	}
	

}
