package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class Palindrom_String {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.next();
		
		String rev="";
		
		String org_str=str;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse String is"+rev);

	
	
	if(org_str.equals(rev))
	{
		System.out.println(org_str + " "+ "String is Palindrom");
	}
	else
	{
		System.out.println(org_str + " "+ "String is not Palindrom");
	}
	}
}
