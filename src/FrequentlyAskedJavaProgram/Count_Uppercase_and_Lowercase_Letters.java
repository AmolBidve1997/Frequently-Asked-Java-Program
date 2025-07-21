package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class Count_Uppercase_and_Lowercase_Letters {

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str = sc.nextLine();
		
		int lowerCaseCount= 0;
		int upperCaseCount=0;
		int digitCount=0;
		int specialCharCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			//if(ch>=60 && ch<=90)
			if(Character.isUpperCase(ch))
			{
				upperCaseCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerCaseCount++;
			}
			else if(Character.isDigit(ch))
			{
				digitCount++;
			}
			else 
			{
				specialCharCount++;
			}
		}
		
		System.out.println("Uppercase letters: " + upperCaseCount);
        System.out.println("Lowercase letters: " + lowerCaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special characters: " + specialCharCount);

	}

}
