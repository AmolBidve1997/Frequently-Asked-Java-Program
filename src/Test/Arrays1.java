package Test;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size=sc.nextInt();
		System.out.print("Enter the values of array: ");
		int number[]=new int[size];
		

		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		System.out.print("Enter the value of x: ");
		int x=sc.nextInt();
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==x)
			{
				System.out.println("x found at index" + i);
			}
		}


	}

}
