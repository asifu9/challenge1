package com.test.simprint.counter;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Abstract Class to represent counter to implement either a word counter or character counter etc.
 *
 */
public abstract class ACounter {

	protected List<String> data;
	
	/**
	 * Method to process the data as per the given counter functionality
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public abstract <K, V> Map process() throws Exception;
	
	/**
	 * Method to sort the Map data by converting hashMap to Tree Map
	 * @param hashMap
	 * @return
	 */
	 public  <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap) 
	    { 
	        Map<K, V> 
	            treeMap = hashMap 
	                          .entrySet() 
	                          .stream() 
	                          .collect( 
	                              Collectors 
	                                  // Using Collectors, collect the entries 
	                                  // and convert it into TreeMap 
	                                  .toMap( 
	                                      Map.Entry::getKey, 
	                                      Map.Entry::getValue, 
	                                      (oldValue, 
	                                       newValue) 
	                                          -> newValue, 
	                                      TreeMap::new)); 
	        // Return the TreeMap 
	        return treeMap; 
	    }


	public void setData(List<String> data) {
		this.data = data;
	} 
	public List<String> getData() {
		return this.data;
	} 
	  
}
