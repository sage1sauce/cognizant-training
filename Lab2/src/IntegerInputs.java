/**
 * Name: Akash Dhar
 * Description: Write a program to Take 20 integer inputs from user and print the following:
				1. number of positive numbers
				2. number of negative numbers
				3. number of odd numbers
				4. number of even numbers
				5. number of 0s.
 * Date: 17/03/2021 
 */
import java.util.Scanner;

public class IntegerInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int NUM_ITEMS = 20;
		int[] items = new int[NUM_ITEMS];
		
		
		System.out.println("Enter the items (separated by space): ");
		for(int i=0; i<NUM_ITEMS;i++) {
			items[i] = sc.nextInt();	
		}
		System.out.println("No. of positive numbers: "+ findPositives(items));
		System.out.println("No of negative numbers: "+ findNegatives(items));
		System.out.println("No. of odd numbers: "+ findOdd(items));
		System.out.println("No. of even numbers: "+ findEven(items));
		System.out.println("No. of zeros: "+ findZeros(items));
	}

	private static int findZeros(int[] items) {
		int noOfZeros = 0;
		for(int item : items) {
			if(item==0) {
				noOfZeros++;
			}
		}
		return noOfZeros;
	}

	private static int findEven(int[] items) {
		int noOfEvens = 0;
		for(int item : items) {
			if(item%2==0) {
				noOfEvens++;
			}
		}
		return noOfEvens;
	}

	private static int findOdd(int[] items) {
		int noOfOdds = 0;
		for(int item : items) {
			if(item%2!=0) {
				noOfOdds++;
			}
		}
		return noOfOdds;
	}

	private static int findNegatives(int[] items) {
		int noOfNeg = 0;
		for(int item : items) {
			if(item<0) {
				noOfNeg++;
			}
		}
		return noOfNeg;
	}

	private static int findPositives(int[] items) {
		int noOfPos = 0;
		for(int item : items) {
			if(item>0) {
				noOfPos++;
			}
		}
		return noOfPos;
	}

}
