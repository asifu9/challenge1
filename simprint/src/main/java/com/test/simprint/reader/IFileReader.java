package com.test.simprint.reader;

/**
 * Interface to represent for reading any file data.
 *
 */
public interface IFileReader {
	
	/**
	 * Method that will be implemented by overridden class for reading file.
	 * @return
	 * @throws Exception
	 */
	java.util.List<String> readAndListData() throws Exception;
}
