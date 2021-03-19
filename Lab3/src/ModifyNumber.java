/**
 * 
 * @author akashdhar
 * Description: Create a method that accepts a number and modifies it such that the each of the digit in the
				newly formed number is equal to the difference between two consecutive digits in the original number.
				The digit in the units place can be left as it is.
 * Date: 19/03/2021
 */
import java.util.Scanner;
import java.lang.StringBuffer;

public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to modify: ");
		int input = sc.nextInt();
		int result = modifyNumber(input);
		System.out.println("The modified number: "+result);
	}

	private static int modifyNumber(int number1) {
		
		String numberString = String.valueOf(number1);
		StringBuffer sb = new StringBuffer();
		int diff=0;
		for(int i=0; i<numberString.length(); i++) {
			if(i==numberString.length()-1) {
				sb.append(numberString.charAt(i));
			}
			else {
				diff = (int) numberString.charAt(i) - (int) numberString.charAt(i+1);
				diff = Math.abs(diff);
				sb.append(diff);
			}
		}
		return Integer.parseInt(sb.toString());
	}

}
