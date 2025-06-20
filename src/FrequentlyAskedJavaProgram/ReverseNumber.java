package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		//1. Using alogorithm
		
		int rev =0;
		
		while(num!=0)
		{
			int rem = num%10; //Gives last digit
			rev= rem+rev*10;  // 0*10+1234%10=4   4*10+123%10=40+3=43  43*10+12%10=430+2=432   432*10+1%10=4320+1=4321
			num=num/10;  //Remove last digit
		}
		
		
		//Using StringBuffer
		
		
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		StringBuffer rev =sb.reverse();*/
		
		
		//Using StringBuilder
		
		
		/*StringBuilder sbl = new StringBuilder();
		
		sbl.append(num);
		
		StringBuilder rev = sbl.reverse();*/
		
		System.out.println("Reverse number is: "+rev);

	}
	
	

		
		
}
