/**
 * Name: Akash Dhar
 * Description: Write a Java program to find the length of the longest consecutive elements sequence from a
				given unsorted array of integers.
 * Date: 17/03/2021
 */
import java.util.Scanner;

public class ConsecutiveElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int NUM_ITEMS;
		System.out.println("Enter the no. of elements in the array: ");
		NUM_ITEMS = sc.nextInt();
		int[] items = new int[NUM_ITEMS];
		System.out.println("Enter the elements: ");
		for(int i=0; i<NUM_ITEMS; i++) {
			items[i] = sc.nextInt();
		}
		// Array has been created
		sort(items);
		int sequenceLength = checkSequence(items);
		System.out.println(sequenceLength);
		
	}

	private static int checkSequence(int[] list) {
		int length = 0;
		int current = 1;
		for(int i=1;i<list.length;i++){
            if (list[i] != list[i-1])
                if (list[i] - list[i-1] == 1) current += 1;
            else {
                length = Math.max(length , current);
                current = 1;
            }
        }
		return length;
	}

	private static void sort(int[] list) {
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
		
	}

}
