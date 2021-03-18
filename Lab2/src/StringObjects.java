/**
 * Name: Akash Dhar
 * Description: Create a method that can accept an array of String objects and sort in alphabetical order.
				The elements in the left half should be completely in uppercase and the elements in the right half should
				be completely in lower case. Return the resulting array.
 * Date: 17/03/2021
 */ 

import java.util.Scanner;

public class StringObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int NUM_ITEMS;
		System.out.println("Enter the no. of elements in the array: ");
		NUM_ITEMS = sc.nextInt();
		String[] items = new String[NUM_ITEMS];
		System.out.println("Enter the elements: ");
		for(int i=0; i<NUM_ITEMS; i++) {
			items[i] = sc.next();
		}
		String[] sortedString = sortStrings(items);
		for(String elem : sortedString) {
			System.out.print(elem + " ");
		}
		
	}


	private static String[] sortStrings(String[] list) {
		String temp="";
		int index;
		for(int i=0; i< list.length; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i].compareTo(list[j])>0) { //using compareTo() to check lexicographically. 
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		if(list.length%2==0) 
			index = list.length/2;
		
		else
			index = (list.length+1)/2;
			
		for(int i=0; i<index+1; i++) {
			list[i].toUpperCase();
		}
		for(int j=index; j<list.length; j++) {
			list[j].toLowerCase();
		}
		return list;
	}
	

}
