/**
 * 
 * @author akashdhar
 * Description: Create a class with a method to find the difference between the sum of the squares and the
				square of the sum of the first n natural numbers.
 * Date: 19/03/2021
 *
 */
import java.util.Scanner;

public class DifferenceSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sumValue = calculateDifference(number);
		System.out.println("The difference: "+ sumValue);

	}

	private static int calculateDifference(int number) {
		int sumOfSquares = 0;
		int normalSum=0;
		for(int i=1; i<=number; i++) {
			sumOfSquares+=(i*i);
			normalSum+= i;
		}
		int sum = sumOfSquares-(normalSum*normalSum);
		return sum;
	}

}
