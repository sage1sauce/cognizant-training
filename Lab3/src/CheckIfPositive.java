/**
 * @author akashdhar
 * Description: Create a method that accepts a String and checks if it is a positive string. A string is
				considered a positive string, if on moving from left to right each character in the String comes after the
				previous characters in the Alphabetical order. For Example: ANT is a positive String (Since T comes after
				N and N comes after A). The method should return true if the entered string is positive.
 * Date: 19/03/2021
 */

import java.util.Scanner;

public class CheckIfPositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = sc.nextLine();
		boolean positive = isPositive(inputString);
		if(positive==true) {
			System.out.println("The string "+ inputString+ " is positive.");
		}
		else {
			System.out.println("The string "+ inputString+ " is negative.");
		}
	}

	private static boolean isPositive(String inputString) {
		boolean isPos = true;
		for(int i=0; i<inputString.length()-1; i++) {
			if(inputString.charAt(i+1)-(inputString.charAt(i))>0)
				continue;
			else
				isPos = false;
				break;
		}
		return isPos;
	}

}
