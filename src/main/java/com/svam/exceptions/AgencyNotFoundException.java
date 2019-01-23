package com.svam.exceptions;

/**
 * 
 * @author tanujkathuria
 *
 */
public class AgencyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2305130525843727470L;

	private String exceptionMessage;

	public AgencyNotFoundException(String  agencyName,String exceptionMessage) {
		super();
		this.exceptionMessage = agencyName +""+exceptionMessage;
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
