package week3.day2HomeAssignments;

import java.util.HashMap;

import java.util.Map;



public class FindIntersection {

	public static void main(String[] args) {
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] arr = {3,2,11,4,6,7};	
		int[] arr1 = {1,2,8,4,9,7};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			
			map.put(arr[i], arr1[i]);		
			
			}
		
		 for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
				if(entry.getValue() == entry.getKey()) {
					System.out.println(entry.getKey());
				}
			
		    }				
	  }
	
	}


