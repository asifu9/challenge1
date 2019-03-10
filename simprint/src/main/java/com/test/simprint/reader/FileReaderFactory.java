package com.test.simprint.reader;

import com.test.simprint.exception.SPException;
import com.test.simprint.utils.FileType;

/**
 * Factory Class to create File Reader object.
 * It support either PDF or WORD as of now
 *
 */
public class FileReaderFactory {

	/**
	 * Factory Method to create file reader object for give fileType and file Path
	 * @param fileType
	 * @param filePath
	 * @return IFileReader Object
	 * @throws Exception
	 */
	public static IFileReader getFileReader(FileType fileType,String filePath) throws SPException{
		switch(fileType){
			case PDF:
				return new PDFFileReader(filePath);
			case WORD:
				return new WordFileReader(filePath);
			default:
				return null;
		}
	}
}
