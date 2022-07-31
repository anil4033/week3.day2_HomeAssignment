package week3.day2HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		// int[] data = {3,2,11,4,6,7};
	
		/*
		   Pseudo Code:
		   1) Arrange the array in ascending order
		   2) Pick the 2nd element from the last and print it
	    */
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			list.add(data[i]);
			
		}
       Collections.sort(list);
       
       System.out.println(list);
       
       Integer integer = list.get(list.size()-2);
              
       System.out.println("The second Largest Number is"+ integer);
	}

} 

