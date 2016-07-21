
		/* Root and square program example
		* Java Programming
		* This is an example of a code header
		*/

import java.text.DecimalFormat;
import java.util.Scanner;

		public class computePandSquare
		{

			public static void main(String[] args) 
			{
				Scanner input = new Scanner(System.in);

				// Declarations
				double userNum;
				double userPower;
				double calcPower;
				double calcRoot;
				// endDeclarations

				System.out.println("This program will allow you to compute the square and the square root of a number.");

				// Prompt for and accept input:
				System.out.print("Enter any number: ");
				userNum = input.nextDouble();

				System.out.println(" "); // Insert a blank line

				// Ask the user for what power is to be used:
				System.out.print("Enter the power to which you want the number raised: ");
				userPower = input.nextDouble();

				System.out.println(" "); // Insert a blank line

				// Now the program will perform the calculations:
				calcPower = Math.pow(userNum, userPower); // Calculate the power
				calcRoot = Math.sqrt(userNum); // Calculate the square root
				
				//Round the square root answer to 4 decimal places
				// DecimalFormat df = new DecimalFormat ("#.####");

				// Finally, output the results to the console:
				System.out.println(userNum + " to the power of " + userPower + " is: " + calcPower + ".");

				// System.out.println("\nThe square root of " + userNum + " is: " + df.format(calcRoot) + 
				//		" rounded to 4 decimal places.");
				
				System.out.println("\nThe square root of " + userNum + " is: " + calcRoot + ".");
				System.out.println("\nThank you for using this program. Goodbye.");

			} // Closing bracket for the main method

		} // Closing bracket for the class
