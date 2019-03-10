package com.test.simprint.counter;

import java.util.List;
import java.util.Map;

/**
 * Class to count number of word present in Array list of string
 *
 */
public class WordCounter extends ACounter{

	private List<String> data;
	
	
	public WordCounter() {
	}

	/**
	 * Constructor
	 * @param data
	 */
	public WordCounter(List<String> data) {
		super();
		this.data = data;
	}

	@Override
	public Map<String, Integer> process() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void setData(List<String> data) {
		this.data = data;
	}
}
