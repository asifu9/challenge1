package com.test.simprint.exception;

/**
 * Exception class to handle PDF encryption error
 *
 */
public class PDFEncryptionException extends SPException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -483875030847420363L;

	public PDFEncryptionException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

}
