package com.test.simprint.reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


/**
 * Class that implement word file reader.
 *
 */
public class WordFileReader implements IFileReader{

	String filePath;
	
	
	/**
	 * Constructor
	 * @param filePath
	 */
	public WordFileReader(String filePath) {
		this.filePath = filePath;
	}



	@Override
	public List<String> readAndListData() throws Exception {
		java.util.List<String> fileData=new ArrayList<>();
		 try (FileInputStream fis = new FileInputStream(new File(filePath))) {
			 XWPFDocument document = new XWPFDocument(fis);
			 for(XWPFParagraph paragraph: document.getParagraphs()){
	                    fileData.add(paragraph.getParagraphText());
	            }

	        }
		 return fileData;
	}

}
