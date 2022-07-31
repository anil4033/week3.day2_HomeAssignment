package week3.day2HomeAssignments;

import java.util.HashMap;
import java.util.Map;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		/* input: abbaba
		 * output: b
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		
		String str ="abbaba";
		
		int maxValue =0;
		char maxoccur = str.charAt(0);
		
		char[] charArray = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < charArray.length; i++) 
		{ 
		map.put(charArray[i], map.getOrDefault(charArray[i],0)+1); 

		if(map.get(charArray[i])>maxValue) 

		{ maxoccur=charArray[i]; 
		maxValue=map.get(charArray[i]); 

		} 
		}
		 System.out.println(maxoccur); 
	}

}
