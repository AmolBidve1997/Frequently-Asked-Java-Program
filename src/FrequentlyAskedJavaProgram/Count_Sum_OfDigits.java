package FrequentlyAskedJavaProgram;

public class Count_Sum_OfDigits {

	public static void main(String[] args) {
		
		int num=123456;
		int sum=0;
		
		while(num>0)
		{
			int digit =num%10;
			
			sum=sum+digit;
			num=num/10;
		
		}
		
		
		
		System.out.println(sum);


	}

}
