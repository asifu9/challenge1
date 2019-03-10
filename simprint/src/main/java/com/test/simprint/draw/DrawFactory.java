package com.test.simprint.draw;

import java.util.Map;

import com.test.simprint.utils.DrawType;

/**
 * Class to implement Horizontal bar
 *
 */
public class DrawFactory {

	/**
	 * Factory method to create the Draw object for given type
	 * @param type
	 * @param data
	 * @return IDraw
	 */
	public static IDraw getDraw(DrawType type,Map data){
		IDraw draw=null;
		switch(type){
		case HORIZONTAL:
			draw=new HorizontalBarDraw(data);
			break;
			
		}
		return draw;
	}

}
