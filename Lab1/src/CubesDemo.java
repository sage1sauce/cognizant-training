/**
 * Name: Akash Dhar
 * Description: Sum of the cubes of digits of a number 
 * Date: 14/4/2021
 */
import java.util.*;

public class CubesDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); 
		int result = cubeNum(num);
		System.out.println("The sum of the cube of the digits is : " + result);
	}

	private static int cubeNum(int num) {
		int temp, sum = 0;
		
		while(num != 0) {
			temp = num%10;
			sum += temp*temp*temp;
			num /= 10;
		}
		return sum;
		
		
	}

}