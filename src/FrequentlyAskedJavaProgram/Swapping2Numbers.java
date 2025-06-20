package FrequentlyAskedJavaProgram;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a= 10;
		int b= 20;

		System.out.println("Before Swapping : " +a + " " +b);

		// LOgic 1 Using Third Variable

		/*int c=a;
		a=b;
		b=c;*/

		//Logic 2  use + & - without using third variable

		/*a=a+b;  //10+20=30
		b=a-b;  //30-20=10
		a=a-b;  //30-10=20*/

		//Logic 3  use * & / without using third variable
		//here a & b values should not be zero

		/*a=a*b;   //10*20=200
		b=a/b;   //200/20=10
		a=a/b;   //200/10=20*/

		//Logic 4  bitwise XOR(^) Operator 

		/*a=a^b;  //10^20=30
		b=a^b;  //30^20=10
		a=a^b;  //30^10=20*/

		//Logic 5  Single Statement

		//b=a+b-(a=b);
		a=a+b-(b=a);


		System.out.println("After Swapping : " +a + " " +b);







	}

}
