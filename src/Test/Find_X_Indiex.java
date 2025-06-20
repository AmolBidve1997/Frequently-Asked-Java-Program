package Test;

import java.util.Scanner;

public class Find_X_Indiex {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		
		int cols = sc.nextInt();
		
		System.out.println("Enter the rows and columns values");
		
		int number[][] = new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				number[i][j]=sc.nextInt();
		}
		
		System.out.println("Enter the value of x");
		
		int x= sc.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				if(number[i][j]==x)
				{
					System.out.println("Number found at index: " +i+","+j);
				}
		}



	}

}
