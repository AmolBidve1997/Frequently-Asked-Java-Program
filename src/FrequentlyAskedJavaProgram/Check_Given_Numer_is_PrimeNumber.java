package FrequentlyAskedJavaProgram;

import java.util.Scanner;

// Natural Number >1
//which has only 2 factors 1 and itself

//19 => 1 and 19 => Prime number
//28 => 1, 2, 4, 7, 14, 28 => Not a Prime Number

public class Check_Given_Numer_is_PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");

		int num =sc.nextInt();
		int count=0;

		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0) 
				{

					count++;
				}
			}
			if(count==2) 
			{
				System.out.println("Given Number is Prime number");
			}
			else
			{
				System.out.println("Given Number is Not Prime number");
			}


		}
		else
		{
			System.out.println("Given Number is Not Prime number");
		}


	}

}
