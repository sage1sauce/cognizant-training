/**
 * 
 * @author akashdhar
 * Description: Create a class with a method which can calculate the sum of first n natural numbers which
				are divisible by 3 or 5.
 * Date: 19/03/2021
 * 
 */

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int integer = sc.nextInt();
		int sumValue = calculateSum(integer);
		System.out.println("The sum: "+ sumValue);

	}

	private static int calculateSum(int number) {
		int sum = 0;
		for(int i=3; i<=number; i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
