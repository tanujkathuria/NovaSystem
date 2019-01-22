package com.svam.exceptions;

/**
 * 
 * @author tanujkathuria
 *
 */
public class UserNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 2305130525843727470L;

	private String exceptionMessage;

	public UserNotFoundException(long id,String exceptionMessage) {
		super();
		this.exceptionMessage = id+""+exceptionMessage;
	}

	@Override
	public String getMessage() {
		return exceptionMessage;
	}

	@Override
	public String toString() {
		return exceptionMessage;
	}

}
