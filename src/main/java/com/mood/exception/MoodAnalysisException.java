package com.mood.exception;

public class MoodAnalysisException extends Exception{

	private String message;
	private ExceptionTypes type;
	
	public MoodAnalysisException() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MoodAnalysisException(String message, ExceptionTypes type) {
		// TODO Auto-generated constructor stub
		super(message);
		this.message = message;
		this.type = type;
	}
	
	public MoodAnalysisException(String message, Throwable e) {
		// TODO Auto-generated constructor stub
		super(message, e);
	}
	
	
}
