package PatternPrograms;

public class Number_Pyramid {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			//spaces
			int spaces=n-i;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			//numbers  ---> Print row no, row times
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+ " ");
			}
			
			System.out.println();
		}


	}

}
