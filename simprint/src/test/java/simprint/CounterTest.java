package simprint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Map;

import org.junit.Test;

import com.test.simprint.counter.ACounter;
import com.test.simprint.counter.CounterFactory;
import com.test.simprint.draw.DrawFactory;
import com.test.simprint.draw.IDraw;
import com.test.simprint.reader.FileReaderFactory;
import com.test.simprint.reader.IFileReader;
import com.test.simprint.utils.CounterType;
import com.test.simprint.utils.DrawType;
import com.test.simprint.utils.FileType;

public class CounterTest {

	@Test
	public void testWordCharacterCounter() throws Exception {
		IFileReader reader= FileReaderFactory.getFileReader(FileType.getFileType(FileReaderTest.WORD_FILE_NAME),FileReaderTest.WORD_FILE_NAME);
		ACounter counter=CounterFactory.getCounter(CounterType.CHARACTER);
		counter.setData(reader.readAndListData());
		Map<String,Integer> data=(Map<String,Integer>) counter.process();
		assertEquals(new Integer(2), data.get("a"));
		assertEquals(new Integer(4), data.get("h"));
		assertEquals(new Integer(1), data.get("p"));
		assertNotEquals(new Integer(4), data.get("e"));
	}
	/**
	 * @throws Exception
	 */
	@Test
	public void testPdfTest() throws Exception {
		IFileReader reader= FileReaderFactory.getFileReader(FileType.getFileType(FileReaderTest.PDF_FILE_NAME),FileReaderTest.PDF_FILE_NAME);
		ACounter counter=CounterFactory.getCounter(CounterType.CHARACTER);
		counter.setData(reader.readAndListData());
		Map<String,Integer> data= (Map<String,Integer>)counter.process();
		assertEquals(new Integer(2), data.get("a"));
		assertEquals(new Integer(4), data.get("h"));
		assertEquals(new Integer(1), data.get("p"));
		assertNotEquals(new Integer(4), data.get("e"));
		
		IDraw draw=DrawFactory.getDraw(DrawType.HORIZONTAL, data);
		draw.draw();
	}


}
