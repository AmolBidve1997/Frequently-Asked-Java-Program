package FrequentlyAskedJavaProgram;

public class Count_NumberofDigits {

	public static void main(String[] args) {
		
		int num= 123454665;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Number of Diogits is: " + count);



	}

}
