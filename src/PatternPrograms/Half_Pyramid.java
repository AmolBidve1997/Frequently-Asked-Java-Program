package PatternPrograms;

public class Half_Pyramid {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}


//for(i=1 to n)
//for(j=1 to i)