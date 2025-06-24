package FrequentlyAskedJavaProgram;

import java.util.HashMap;

public class Count_Occurences_Of_Each_Character {
	
	public static void main(String[] args) {
		
		
		
		String inputStr = "i love my india i live in india";
		
		HashMap<Character , Integer> charCountMap = new HashMap<Character, Integer>();
		
		int len = inputStr.length();
		
		for(int i=0; i<len;i++) {
			
			Character key = inputStr.charAt(i);
			
			if(charCountMap.containsKey(key)) {
				int count = charCountMap.get(key);
				
				charCountMap.put(key, count+1);
			}
			else {
				
				charCountMap.put(key, 1);
				
			}
		}
		
		System.out.println(charCountMap);
			
		}

}
