package com.insightglobal.day5;

public class CredentialException extends Exception{
	private String name;
	public CredentialException() {
		
	}
	public CredentialException(String name) {
		this.name = name;
	}
	@Override
	public String getMessage() {
		return "Invalid Credentials";
	}
	@Override
	public String toString() {
		return "Userid:" +this.name+" is invalid";
	}
	
}
