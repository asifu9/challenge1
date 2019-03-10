package simprint;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.test.simprint.exception.FileExtensionNotSupportedException;
import com.test.simprint.reader.FileReaderFactory;
import com.test.simprint.reader.IFileReader;
import com.test.simprint.utils.FileType;

public class FileReaderTest {

	public static final String  WORD_FILE_NAME="src/test/resources/Test this file with junit.docx";
	public static final String PDF_FILE_NAME="src/test/resources/Test this file with junit.pdf";

	@Test
	public void testWordFile() throws Exception {
		IFileReader reader= FileReaderFactory.getFileReader(FileType.getFileType(WORD_FILE_NAME),WORD_FILE_NAME);
		assertNotNull(reader);
	}
	
	@Test
	public void testPdfTest() throws Exception {
		IFileReader reader= FileReaderFactory.getFileReader(FileType.getFileType(PDF_FILE_NAME), PDF_FILE_NAME);
		assertNotNull(reader);
	}
	
	@Test(expected=FileExtensionNotSupportedException.class)
	public void testWrongFilePathTest() throws Exception {
		FileReaderFactory.getFileReader(FileType.getFileType("/Test this file with junit.pdfa"),"/Test this file with junit.pdfa");
	}
	
	@Test(expected=FileNotFoundException.class)
	public void testFileNotFound() throws Exception {
		FileReaderFactory.getFileReader(FileType.getFileType("/Test11 this file with junit.pdf"),"/Testq this file with junit.pdf").readAndListData();
	}


}
