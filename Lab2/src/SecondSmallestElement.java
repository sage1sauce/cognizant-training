/**
 * Name: Akash Dhar
 * Description: Create a method which accepts an array of integer elements and return the second smallest
				element in the array.
 * Date: 17/03/2021
 */

import java.util.Scanner;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		final int NUM_ITEMS;
		System.out.println("Enter the number of elemets in the array: ");
		NUM_ITEMS = sc.nextInt();
		int[] items = new int[NUM_ITEMS];
		System.out.println("Enter the elements: ");
		for(int i=0; i<NUM_ITEMS; i++) {
			items[i] = sc.nextInt();
		}
		// Array has been created
		int secondSmallestElem = getSecondSmallest(items);
		System.out.println("The second smallest element in the array: "+secondSmallestElem);

	}

	private static int getSecondSmallest(int[] list) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i=0; i<list.length; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i]>list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
		return list[1];
	}

}
