/**
 * 
 * @author akashdhar
 * Description: Write a Java program that displays the number of characters, lines and words in a text.
 * Date: 19/03/2021
 * 
 */

import java.util.Scanner;

public class TextDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		int characters = findCharacters(inputString);
		int lines = findLines(inputString);
		int words = findWords(inputString);
		System.out.println("characters: "+ characters);
		System.out.println("lines: "+ lines);
		System.out.println("words: "+ words);
		

	}

	private static int findWords(String inputString) {
		int words = 0;
			String[] array = inputString.split(" ");
			words = array.length;
		return words;
	}

	private static int findLines(String inputString) {
		int lines = 0;
		for(int i=0; i<inputString.length(); i++) {
			char temp=inputString.charAt(i);
			if(temp=='.' || temp=='!' || temp=='?') {
				lines++;
			}
		}
		return lines;
	}

	private static int findCharacters(String inputString) {
		int characters=0;
			char[] symbols = new char[] {'.','!','?',' '};
			for(int i=0; i<inputString.length(); i++) {
				if(new String(symbols).indexOf(inputString.charAt(i)) == -1) {
					characters++;
				}
			}
		return characters;
	}

}
