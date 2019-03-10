package com.test.simprint.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class to implement Character Counter
 * This class will extract data from list and convert each list string
 * to characters and counting the numbers using map.
 *
 */
public class CharacterCounter extends ACounter{

	
	
	
	
	public CharacterCounter() {
	}


	/**
	 * Constructor 
	 * @param data
	 */
	public CharacterCounter(List<String> data) {
		this.data = data;
	}

	
	@Override
	public Map<String, Integer> process() throws Exception {
		 List<String> list = new ArrayList<>();
		 
		 data.forEach(d->{
			 for(char ch:d.toCharArray()){
				 int asciValue=(int) ch;
				 // 48 to 57 for 0...9 , 65 to 90  97 to 122 for a,b....z
				 if((asciValue>=48 && asciValue <= 57)||(asciValue>=97 && asciValue <= 122)){
					 list.add(""+ch);
				 }
				 
			 }
		
		 });
        Map<String, Integer> counts = (Map<String, Integer>) list.parallelStream().
            collect(Collectors.toConcurrentMap(
                w -> w, w -> 1, Integer::sum));
        System.out.println(counts);
		return convertToTreeMap(counts);
	}

}
