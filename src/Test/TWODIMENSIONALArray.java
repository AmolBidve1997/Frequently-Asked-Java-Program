package Test;

import java.util.Scanner;

public class TWODIMENSIONALArray {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns");
		int cols=sc.nextInt();
		System.out.println("Enter values of rows & columns");
		int numbers [][]= new int [rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				numbers[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) 
			{
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
