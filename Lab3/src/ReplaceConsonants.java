/**
 * 
 * @author akashdhar
 * Description: Create a method which accepts a String and replaces all the consonants in the String with
 *				the next alphabet.
 * Date: 18/03/2021
 * 
 */
import java.util.Scanner;

public class ReplaceConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = sc.nextLine();
		String replacedString = alterString(inputString);
		System.out.println(replacedString);

	}

	private static String alterString(String inputString) {
		String finalString="";
		char[] vowels = new char[] {'a', 'e' , 'i' , 'o' , 'u' , 'A', 'E', 'I', 'O', 'U'};
		char[] characterArray = inputString.toCharArray();
		for(int i=0; i<characterArray.length;i++) {
			if (new String(vowels).indexOf(characterArray[i]) == -1) {
				if(characterArray[i]=='Z') {
					characterArray[i] = 'A';
				}
				else if(characterArray[i]=='z') {
					characterArray[i] = 'a';
				}
				else 
					characterArray[i] = (char) (characterArray[i] + 1);
				
			}
		}		
		finalString = String.valueOf(characterArray);
		return finalString;
	}

}
