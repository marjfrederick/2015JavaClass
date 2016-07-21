// This program determines if a year is a Leap Year

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		// Create a Scanner object to handle any input
		Scanner input = new Scanner (System.in);
		
		// Ask user for a year
		System.out.print ("Enter a year: ");
		int year = input.nextInt ();
		
		// check to see if the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// Display the result
		System.out.println (year + " is a leap year? " + isLeapYear);
	}

}
