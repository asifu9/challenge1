package com.test.simprint.counter;

import com.test.simprint.utils.CounterType;

/**
 * 
 * @author i340632
 *
 */
public class CounterFactory {

	public static ACounter getCounter(CounterType type){
		ACounter counter=null;
		switch(type){
		case CHARACTER:
			counter=new CharacterCounter();
			break;
		case WORD:
			counter=new WordCounter();
			break;
			
		}
		return counter;
	}
}
