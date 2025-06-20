package FrequentlyAskedJavaProgram;

public class Count_Numberof_Even_Odd_Numbers {

	public static void main(String[] args) {

		int num = 156708;
		int even_count=0;
		int odd_count=0;

		if(num==0)
		{
			even_count=1;
		}
		else
		{

			while(num!=0)
			{
				int rem=num%10;  //Get Last Digit

				if(rem%2==0)
				{
					even_count++;
				}
				else
				{
					odd_count++;
				}
				num=num/10;  //Remove last Digit

			}
		}
		System.out.println("Even number count is: "+ even_count);
		System.out.println("odd number count is: "+odd_count);


	}

}
