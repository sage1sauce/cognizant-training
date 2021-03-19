/**
 * 
 * @author akashdhar
 * Description: Create a method to check if a number is an increasing number
 * Date: 20/03/2021 
 *
 */
import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		boolean isIncreasing = checkNumber(number);
		if(isIncreasing==true) 
			System.out.println(number+ " is increasing.");
		else
			System.out.println(number+ " is not increasing.");
		
		
	}

	private static boolean checkNumber(int number) {
		int temp=0;
		int prevTemp=0;
		int tempNumber = number;
		while(tempNumber!=0) {
			if(tempNumber==number) {
				temp = tempNumber%10;
				tempNumber/=10;
				prevTemp = tempNumber%10;
				tempNumber/=10;
			}
			else if(prevTemp<temp){
				temp = prevTemp;
				prevTemp = tempNumber%10;
				tempNumber/=10;
			}
			else return false;
		}
		return true;
	}

}
