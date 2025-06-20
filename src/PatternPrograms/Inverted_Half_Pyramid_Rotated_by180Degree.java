package PatternPrograms;

public class Inverted_Half_Pyramid_Rotated_by180Degree {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			
			//Inner loop ----> Space Print
			for(int j=1; j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			//Inner loop ----> Star Print
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
