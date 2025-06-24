package FrequentlyAskedJavaProgram;

public class Even_and_Odd_Numbers {

	public static void main(String[] args) {


		int a[]= {1, 3, 4, 6, 5, 2, 7};
		int even_count=0;
		int odd_count=0;
		
		//Extracting even Numbers
		
	
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}*/
		
		//Enhanced for loop
		
		for(int value:a)
		{
			if(value%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		
		System.out.println("Even number is: " +even_count);
		System.out.println("Odd number is: " +odd_count);

	}

}
