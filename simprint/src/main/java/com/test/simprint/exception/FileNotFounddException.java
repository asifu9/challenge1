package com.test.simprint.exception;

/**
 * Exception class to handle file not found error
 *
 */
public class FileNotFounddException extends SPException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4251557848183949812L;

	/**
	 * Constructor
	 * @param errorCode
	 * @param errorMessage
	 */
	public FileNotFounddException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

}
