/**
 * @author akashdhar
 * Description: Create a method to accept the date and print the duration in days, months and years with
				regards to the current system date.
 * Date: 19/03/2021
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in the following format(YYYY-MM-DD): ");
		LocalDate date = LocalDate.parse(sc.next());
		LocalDate presentDate = LocalDate.now();
		Period difference = Period.between(date, presentDate);
		int days = difference.getDays();
		int months = difference.getMonths();
		int years = difference.getYears();
		System.out.println("The difference is " + days + " days, " +months+ " months and "+ years+ " years.");
	}

}
