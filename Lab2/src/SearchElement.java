/**
 * Name: Akash Dhar
 * Description: Java program to test if an array contains a specific value
 * Date: 17/03/2021
 */

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM_ITEMS;
		int[] items;
		
		System.out.println("Enter the no. of elements in the array: ");
		NUM_ITEMS = sc.nextInt();
		items = new int[NUM_ITEMS];
		
		if(NUM_ITEMS>0) {
			System.out.println("Enter the items (separated by space): ");
			for(int i=0; i<NUM_ITEMS;i++) {
				items[i] = sc.nextInt();			
			}
		}
		System.out.println("Enter the element that you want to search: ");
		int element = sc.nextInt();
		boolean result = searchforElement(element, items);
		if(result)
			System.out.println("The array contains the value "+ element);
		else System.out.println(element+ " not found");
		
	}

	private static boolean searchforElement(int element, int[] items) {
		boolean found = false;
		for (int item : items) {
			if(item==element)
				found = true;
		}
		return found;
	}



}
