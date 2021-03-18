/**
 * Name: Akash Dhar
 * Description: Traffic Lights Program
 * Date: 14/4/2021
 */

import java.util.Scanner;

public class TrafficLightsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----SELECT A LIGHT----");
		System.out.println("1. Red");
		System.out.println("2. Yellow");
		System.out.println("3. Green");
		int choice = sc.nextInt();
		String action = think(choice);
		System.out.println(action);
	}

	private static String think(int choice) {
		String act = ""; 
		switch(choice) {
		case 1 : 
			act = "Stop";
			break;
		case 2 : 
			act = "Ready";
		    break;
		case 3 : 
			act = "Go";
			break;
		default : 
			act = "Wrong Input";
		}
		return act;
	}

}
