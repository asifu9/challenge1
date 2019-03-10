package com.test.simprint;

import java.util.Map;

import com.test.simprint.counter.ACounter;
import com.test.simprint.counter.CounterFactory;
import com.test.simprint.draw.DrawFactory;
import com.test.simprint.draw.HorizontalBarDraw;
import com.test.simprint.draw.IDraw;
import com.test.simprint.reader.FileReaderFactory;
import com.test.simprint.reader.IFileReader;
import com.test.simprint.utils.CounterType;
import com.test.simprint.utils.DrawType;
import com.test.simprint.utils.FileType;

/**
 * Main class to test word/character count To run this program, follow below
 * steps 1. set fileName to a proper absolute path of the file. 2. As of now
 * this implementation is implemented only for character count, word count not
 * implemented. 3. Draw is options, hence if you want to draw then create object
 * of Horizontal draw class and call its draw method.
 *
 */
public class SimprintTest {

	public static void main(String[] args) {

		new SimprintTest().readAndCount("/coverletter-Java developer.docx");
	}

	public void readAndCount(String fileName) {

		try {
			// create the file reader object for given file name
			IFileReader fileReader = FileReaderFactory.getFileReader(FileType.getFileType(fileName), fileName);

			// create the counter object for character
			ACounter counter = CounterFactory.getCounter(CounterType.CHARACTER);
			// set the character data by reading from file reader
			counter.setData(fileReader.readAndListData());

			// get the result of counter in nap
			@SuppressWarnings("unchecked")
			Map<String, Integer> result = counter.process();

			// draw horizontal lines for each count of character
			IDraw draw = DrawFactory.getDraw(DrawType.HORIZONTAL,result);
			
			draw.draw();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
