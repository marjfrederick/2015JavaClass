// This program tests rounding concepts

import java.util.Scanner; // Imports the Scanner object used for user prompts

public class RoundingTest
{
	public static void main(String[] args)
	{
		double num; double rNum;
		
		// Create the Scanner input Object
		Scanner input = new Scanner(System.in);

		// Initialize the Do-While condition to "No not finished"
		String testAgain = "N";
		do 
		{
			System.out.print (" Enter a number to round: ");
			num = input.nextDouble();
			System.out.println ("\nThe number to round as a double: " + num);
			
			rNum = Math.round(num * 100.0) / 100.0;
			System.out.println ("The rounded number using Math.round(num * 100.0) / 100.0  = " + rNum);

			// allow the user the opportunity to do another rounding test or quit
		    System.out.print("\nWould you like to do another rounding test (Y/N)? ");
			testAgain = input.next();	

		} while ("Y".equals(testAgain));

	}

}
