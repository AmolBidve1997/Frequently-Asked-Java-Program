package FrequentlyAskedJavaProgram;

import java.util.HashMap;
import java.util.Scanner;

public class JAVA_Character_Count {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str = sc.nextLine();
		
		HashMap<Character, Integer> charcountmap = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char key =str.charAt(i);
			
			if(charcountmap.containsKey(key)) {
				int count = charcountmap.get(key);
				charcountmap.put(key, count+1);
			}
			else
			{
				charcountmap.put(key, 1);
			}
			
			
		}
		System.out.println(charcountmap);

	}

}
