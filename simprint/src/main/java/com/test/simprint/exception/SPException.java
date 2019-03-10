package com.test.simprint.exception;


/**
 * Abstract Exception class to represent top level of exception
 *
 */
public abstract class SPException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -593139504141188069L;

	private String errorCode;

	/**
	 * Constructor
	 * @param errorCode
	 * @param errorMessage
	 */
	public SPException (String errorCode, String errorMessage)
	{
		super(errorMessage);
	}

	/**
	 * Method to get the error code
	 * @return
	 */
	public String getErrorCode()
	{
		return this.errorCode;
	}

}
