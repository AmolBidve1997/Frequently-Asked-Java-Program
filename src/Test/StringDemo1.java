package Test;

import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Name");
		//When we uset next() then we get single word
		//String name=sc.next();
		System.out.println("Enter Name1");
		//When we use nextLine() then we get full String with spaces
		String name1=sc.nextLine();
	//	System.out.println(" User input is: "+ name);
		System.out.println(" User input is: "+ name1);

	}

}
