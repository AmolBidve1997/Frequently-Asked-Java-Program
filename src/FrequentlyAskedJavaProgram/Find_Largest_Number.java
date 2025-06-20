package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class Find_Largest_Number {

	public static void main(String[] args) {
		
		int a=100;
		int b=170;
		int c=99;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		
		if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}
		
		/*int a[]= {100, 200, 323, 223};
		
		int largest=a[0];
		
		for(int x:a)
		{
			if(x>largest)
			{
				largest=x;
			}
		}
		System.out.println("Largest number is: " + largest);*/
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a= sc.nextInt();
		
		System.out.println("Enter Second number");
		int b= sc.nextInt();
		
		System.out.println("Enter Third number");
		int c= sc.nextInt();
		
		/*if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		
		if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}
		
		//Using Terniary Operator
		
		int largest1 = a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		
		System.out.println(" Largest number is" + largest2);*/
		
		

	}

}
