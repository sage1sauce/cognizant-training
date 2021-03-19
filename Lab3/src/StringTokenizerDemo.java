/**
 * 
 * @author akashdhar
 * Description: Write a Java program that reads a line of integers and then displays each integer and the
				sum of all integers. (Use String Tokenizer class)
 * Date: 18/03/2021
 * 
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values separated by a comma: ");
		String inputString = sc.next();
		StringTokenizer tokens  = new StringTokenizer(inputString,",");
		int[] array = new int[tokens.countTokens()];
		int i=0;
		while(tokens.hasMoreTokens()) {
			array[i] = Integer.parseInt(tokens.nextToken()); 
			i++;
		}
		display(array);
		int result = add(array);
		System.out.println("Sum of elements: "+ result);
	}

	private static void display(int[] array) {
		// TODO Auto-generated method stub
		System.out.print("The elements in the array: ");
		for(int element: array) {
			System.out.print(element+" ");
		}
		System.out.println();
		
	}

	private static int add(int[] array) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int element: array) {
			sum+=element;
		}
		return sum;
	}

}
