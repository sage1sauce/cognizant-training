/**
 * Name: Akash Dhar
 * Description: Prime Numbers 
 * Date: 14/4/2021
 */

import java.util.Scanner;
import java.lang.StringBuilder;
public class PrimeNumberDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		String numbers = calculatePrime(num);
		System.out.println("The series is: "+ numbers);
		
	}

	private static String calculatePrime(int num) {
		String list = "";
		StringBuilder sb = new StringBuilder(list);
		for(int i=1; i<=num; i++) {
			if(isPrime(i)) {
				sb.append(i+" ");
			}
		}
		String single = sb.toString();
		return single;
	}

	private static boolean isPrime(int number) {
		if (number <= 1)
		    return false;
		 
		for (int j = 2; j < number; j++)
		    if (number % j == 0)
		        return false;
		 
		return true;
	}

}
