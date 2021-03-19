/**
 * 
 * @author akashdhar
 * Description: Create a class containing a method to create the mirror image of a String. The method
				should return the two Strings separated with a pipe(|) symbol
 * Date: 18/03/2021
 * 
 */

import java.util.Scanner;
import java.lang.StringBuffer;

public class MirrorImage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = sc.nextLine();
		String mirroredString = getImage(inputString);
		System.out.println("Mirrored String: "+mirroredString);
	}

	private static String getImage(String inputString) {
		// TODO Auto-generated method stub
		StringBuffer sbInput = new StringBuffer();
		StringBuffer sbOutput = new StringBuffer();
		sbInput.append(inputString);
		sbOutput.append(inputString);
		sbOutput.reverse();
		sbInput.append("|"+sbOutput);
		return sbInput.toString();
	}

}
