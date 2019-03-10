package com.test.simprint.reader;

import java.io.File;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import com.test.simprint.exception.PDFEncryptionException;


/**
 * Class to read PDF file data
 * @author i340632
 *
 */
public class PDFFileReader implements IFileReader{

	String filePath;
	
	
	/**
	 * Constructor
	 * @param filePath
	 */
	public PDFFileReader(String filePath) {
		this.filePath = filePath;
	}


	@Override
	public java.util.List<String> readAndListData() throws Exception{
		java.util.List<String> fileData=new ArrayList<>();
		//read the file data
		 try (PDDocument document = PDDocument.load(new File(filePath))) {

	            document.getClass();
	            if (!document.isEncrypted()) {
				
	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	                //insert PDF data to file data list
	                fileData.add(pdfFileInText);
	            }else{
	            	throw new PDFEncryptionException("ERR-003","Given PDF is encrypted.");
	            }

	        }
		 return fileData;
		
	}

}
