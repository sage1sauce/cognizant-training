/**
 * @author akashdhar
 * Description: Create a method to check if a number is a power of two or not
 * Date: 20/03/2021
 * 
 */

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		boolean isPower = checkNumber(number);
		if(isPower)
			System.out.println(number+ " is a power of 2");
		else
			System.out.println(number+ " is not a power of 2");

	}

	private static boolean checkNumber(int number) {
		
		 while(number%2==0){
			 number=number/2;
		 	}
		 if(number==1)
			 return true;
		 	
		 else
			 return false;
		 	
	}

}
