/**
 * Name: Akash Dhar
 * Description: Java program to convert ArrayList into Array
 * Date: 17/3/2021
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>(); 
		final int NUM_ITEMS;
		
		System.out.println("Enter the number of values in the array: ");
		NUM_ITEMS = sc.nextInt();
		
		for(int i=0; i<NUM_ITEMS; i++) {
			al.add(sc.nextInt());
		}
		
		Object[] objects = al.toArray(); 
		  
        for (Object obj : objects) 
            System.out.print(obj + " "); 

	}

}
