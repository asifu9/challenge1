package com.test.simprint.exception;

/**
 * Exception class to handle File not supported error
 *
 */
public class FileExtensionNotSupportedException extends SPException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -483875030847420363L;

	public FileExtensionNotSupportedException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

}
