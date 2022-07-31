package week3.day2HomeAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,5,7,6,8};

		// Sort the array	
				
		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
		
		Arrays.sort(arr);
		List<Integer> lst = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			lst.add(arr[i]);
			
		}
					
		System.out.println(lst);
		
		for (int j = 1; j < arr.length; j++) {
			
			boolean contains = lst.contains(j);
			
			if (contains == false) {
				System.out.println(" the Missed Number is "+ j);
			}
		}
		
		
		}
	   

	}


