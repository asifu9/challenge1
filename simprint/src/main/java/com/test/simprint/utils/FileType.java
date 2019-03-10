package com.test.simprint.utils;

import org.apache.commons.io.FilenameUtils;

import com.test.simprint.exception.FileExtensionNotSupportedException;
import com.test.simprint.exception.SPException;

/**
 * Enum file to represent differnt file Type
 *
 */
public enum FileType {

	PDF,
	WORD,
	TEXT;
	
	/**
	 * Method to get the FileType for given file extension
	 * for pdf file it will return PDF
	 * for doc or docx file it will return WORD
	 * @param filePath
	 * @return FileType
	 */
	public static FileType getFileType(String filePath) throws SPException{
		String fileType= FilenameUtils.getExtension(filePath);
		if(fileType.toString().equals("pdf")){
			return FileType.PDF;
		}else if(fileType.toString().equals("doc")||fileType.toString().equals("docx")){
			return FileType.WORD;
		}else{
			throw new FileExtensionNotSupportedException("ERR-002",String.format("File extenstion %s is not supported ",fileType));
		}

	}
}
