package PatternPrograms;

public class Diamond_Pattern {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			//spaces
			int spaces=n-i;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
					
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		// 2nd half
		for(int i=n;i>=1;i--)
		{
			//spaces
			int spaces=n-i;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();

		}

	}

}
