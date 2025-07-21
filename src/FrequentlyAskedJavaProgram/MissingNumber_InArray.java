package FrequentlyAskedJavaProgram;

public class MissingNumber_InArray {

	public static void main(String[] args) {
		
		//Array should not have duplicates
		//Array is need to be sorted order
		//Value should be in range
		
		int a[]= {5, 6, 8,9,10};
		
		int sum1=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elemets in Array: "+sum1);
		
		int sum2=0;
		
		for(int i=5;i<=10;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("Sum of range of elements: " +sum2);
		
		System.out.println("Missin g number is: "+ (sum2-sum1));



	}

}
