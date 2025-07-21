package FrequentlyAskedJavaProgram;

public class Maximun_Minium_Value_InArray {

	public static void main(String[] args) {
		
		int a[]= {40, 10, 20, 30, 6};
		
		/*int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
				
		}
		System.out.println("Maximum Value in Array is: "+ min);*/
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum Value in Array is: "+ max);

	}

}
