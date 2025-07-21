package FrequentlyAskedJavaProgram;

import java.util.HashSet;

public class Duplicate_Elements_In_Array {

	public static void main(String[] args) {


	//	String arr[] = {"java", "c","c++","python","java"};
		
		//Approach 1
		
		/*boolean flag =false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicates Element: "+arr[i] );
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicates Element not Found." );
		}*/
		
		
		//Approach 2 :HashSet
		String arr[] = {"java", "c","c++","python","c#"};
		HashSet <String> langs=new HashSet();
		
		/*System.out.println(langs.add("Java"));
		System.out.println(langs.add("Python"));
		System.out.println(langs.add("Java"))*/
		boolean flag = false;
		for(String l:arr)
		{
			if((langs.add(l)==false))
			{
				System.out.println("Found Duplicates Element: "+l);
				flag=true;
			}	
		}
		
		if(flag==false)
		{
			System.out.println("Duplicates Element not Found.");
		}
	}

}
