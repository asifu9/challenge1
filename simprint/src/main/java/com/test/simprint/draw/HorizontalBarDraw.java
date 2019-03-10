package com.test.simprint.draw;

import java.util.Map;

/**
 * Class to implement Horizontal bar
 *
 */
public class HorizontalBarDraw implements IDraw {

	
	Map<String, Integer> data;
	
	
	public HorizontalBarDraw() {
	}

	/**
	 * Constructor
	 * @param data
	 */
	public HorizontalBarDraw(Map<String, Integer> data) {
		super();
		this.data = data;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		data.forEach((key,value)->{
			System.out.print("\n"+key+": ");
			for(int i=0;i<value;i++){
				System.out.print("-");
			}
		});
	}

	public Map<String, Integer> getData() {
		return data;
	}

	public void setData(Map<String, Integer> data) {
		this.data = data;
	}

	
}
