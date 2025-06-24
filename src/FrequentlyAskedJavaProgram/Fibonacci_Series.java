package FrequentlyAskedJavaProgram;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		// A series of numbers in which each number (Fibonacci number)is the sum of the two preceding numbers.
		
		int n1=0, n2=1, sum=0;
		
		//System.out.println(n1+ " "+n2);
		
		for(int i=2;i<10;i++)  //Starts with i = 2 because the first two Fibonacci numbers (0, 1) are already initialized in n1 and n2
		{
			sum =n1+n2;
			System.out.println(" "+sum);
			
			n1=n2;  //n1 takes the value of n2
			n2=sum;
		}

	}

}
