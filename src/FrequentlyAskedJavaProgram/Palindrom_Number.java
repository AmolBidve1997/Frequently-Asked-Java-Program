package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		int rev =0;
		
		int org= num;
		
		while(num!=0)
		{
			int rem = num%10;  //Give the last digit
			rev = rev*10+rem;
			num=num/10; //Remove last digit
		}
		
		//System.out.println(rev);
		
		if(org==rev)
		{
			System.out.println(org +" "+"Number is Palindrom Number");
		}
		
		else
		{
			System.out.println(org +" "+"Number is not Palindrom Number");
		}

	}

}
