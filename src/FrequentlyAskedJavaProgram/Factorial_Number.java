package FrequentlyAskedJavaProgram;
//A Factorial is a function that multiplies a number by every number below it.
public class Factorial_Number {

	public static void main(String[] args) {
		
		int num=15;
		long factorial=1;
		
		/*for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}*/
		
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial Number is: " +factorial );

	}

}
