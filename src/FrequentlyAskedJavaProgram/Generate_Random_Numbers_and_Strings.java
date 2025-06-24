package FrequentlyAskedJavaProgram;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Generate_Random_Numbers_and_Strings {

	public static void main(String[] args) {
		
		//Approach 1 ----> Random
		
		Random rand = new Random();
		
		int randomint = rand.nextInt(1000);
		System.out.println(randomint);
		
		Double doublerand=rand.nextDouble(); // Range 0.0 and less than 1.0
		System.out.println(doublerand);
		
		//Approach 2 ----> Math
		
		System.out.println(Math.random());
		
		//Approach 3 ----> Apache commns-lang API
		
		//https://commons.apache.org/proper/commons-lang/download_lang.cgi
		
		String randomNum = RandomStringUtils.randomNumeric(15);
		
		System.out.println("Random Number: "+randomNum);
		
		String randomString = RandomStringUtils.randomAlphabetic(10);
		
		System.out.println("Random String: " + randomString);

	}

}
