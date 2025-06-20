package Test;

public class StringDemo {

	public static void main(String[] args) {


		String firstName="tony";
		String lastName="stark";
		//Concatenation
		String fullName=firstName+"@"+lastName;
		System.out.println(fullName);
		//lenth of String
		System.out.println(fullName.length());
		
		//charAt
		
		for(int i=0;i<fullName.length();i++)
		{
			System.out.println(fullName.charAt(i));
		}
		
		//comapre
		// 1) s1>s2 :  +ve value
		// 2) s1==s2 : 0
		// 3) s1<s2 : -ve value
		if(firstName.compareTo(fullName)==0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

	}

}
