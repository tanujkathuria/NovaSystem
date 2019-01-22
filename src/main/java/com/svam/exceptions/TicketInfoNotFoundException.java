package com.svam.exceptions;

public class TicketInfoNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 2305130525843727470L;

	private String exceptionMessage;

	public TicketInfoNotFoundException(String  deviceId,String exceptionMessage) {
		super();
		this.exceptionMessage = deviceId +""+exceptionMessage;
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
