package week3.day2HomeAssignments;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */
		
		/*
		 * Psuedcode:
		 * 
		 * 1) Create Map -> TreeMap
		 * 2) For loop -> each number -> add to the map
		 * 3) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
		
		int[] arr = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
						
		}
		
		/*for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			
			//if the map already contains the input,
			//increment the count value by 1
			//else assign the value as 1
			
			if(map.containsKey(key)) {
				int value = map.get(key);
				map.put(arr[i], value+1);
			}else
			{
				map.put(arr[i], 1);

			}*/
		
		System.out.println(map);
		

	  }

	}

