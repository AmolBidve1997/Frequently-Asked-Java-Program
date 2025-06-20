package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {


		// 1) Using String Concatenation Operator
		
		String str = "ABCD";
		String rev="";
		
		
		
		/*for(int i=str.length()-1;i>=0;i--)  //3  2 1 0 -1
		{
			rev=rev+str.charAt(i); //DCBA
		}
		
		System.out.println("Reverse String is: " +rev);*/
		
		
		
		
		// 2) Using Character array
		
		/*char a[]= str.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String is: " +rev);*/
		
		
		// 3) Using StringBuffer 
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		
	}
	
	
	
	

}
