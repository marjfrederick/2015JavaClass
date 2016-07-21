/**********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 2 Assignment 1: BuzyBot Calculator                                      *
 * Due 06/24/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program creates a basic calculator for the user (an elementary student)  *
 *  The program prompts the user for the type of calculation (addition,           *
 *  subtraction, multiplication or division) and then asks the user for two       *
 *  numbers and then performs the operation and reports the answer to the user.   *
 *  If the answer is a whole number the answer is output as a whole number since  *
 *  the user is an elementary student and may not be familiar with decimals.      *
 *                                                                                *
 * ********************************************************************************/

import java.util.Scanner; // Imports the Scanner object used for user prompts

public class BuzyBotCalculator
{

	public static void main(String[] args)
	{
		// Create the Scanner input Object
		Scanner input = new Scanner(System.in);

		// Introduce the calculator and prompt the user for the type of
		// operation
		System.out.println("Welcome to the BuzyBot Calculator");
		System.out.println("We will now perform a BuzyBot calculation:");
		System.out
				.print("Tell me what operation you want BuzyBot to perform. Enter:"
						+ "\n\t a: for addition"
						+ "\n\t s: for subtraction"
						+ "\n\t m: for multiplication"
						+ "\n\t d: for division"
						+ "\nWhat is your choice: ");
		
		// read string and convert to lower case
		String userInputString = input.nextLine().toLowerCase();

		// Initialize the userOperation to an invalid operation.
		// This allows zero length strings to be properly handled.		
		char userOperation = ' ';

		// Set the operation to a single character - the first character of the string
		if (userInputString.length() > 0)
		{
			userOperation = userInputString.charAt(0);
		}

		// Test to make sure the operation is valid
		if (userOperation == 'a' || userOperation == 's'
				|| userOperation == 'm' || userOperation == 'd')
		{

			// Prompt the user to input the two numbers
			System.out.print("Enter the first number: ");
			double firstNumber = input.nextDouble();
			System.out.print("Enter the second number: ");
			double secondNumber = input.nextDouble();
			
			double answer;

			if (userOperation == 'a') // Add the two numbers
			{
				answer = firstNumber + secondNumber;
				
				// Output the answer either as a whole number or a decimal
				if (answer % 1 == 0)  // We have a whole number 
					System.out.println ("You selected addition, the ANSWER is " + (int)answer);
				else
					System.out.printf("You selected addition, the ANSWER is %4.2f\n", answer);
				
			} else if (userOperation == 's') // Subtract the two numbers
			{
				answer = firstNumber - secondNumber;
				
				// Output the answer either as a whole number or a decimal				
				if (answer % 1 == 0)  // We have a whole number 
					System.out.println ("You selected subtraction, the ANSWER is " + (int)answer);
				else
					System.out.printf("You selected subtraction, the ANSWER is %4.2f\n", answer);
				
			} else if (userOperation == 'm') // Multiply the two numbers
			{
				answer = firstNumber * secondNumber;
				
				// Output the answer either as a whole number or a decimal
				if (answer % 1 == 0)  // We have a whole number 
					System.out.println ("You selected multiplication, the answer is " + (int)answer);
				else
					System.out.printf("You selected multiplication, the answer is %4.2f\n", answer);
				
			} else if (userOperation == 'd') // Divide the two numbers
			{				
				// Check to make sure there is no division by zero
				if (secondNumber == 0.0)
				{
					System.out.println ("You cannot divide by zero. No answer is possible.");
				}
				else 
				{
				    answer = firstNumber / secondNumber;
				    
					// Output the answer either as a whole number or a decimal
					if (answer % 1 == 0)  // We have a whole number 
						System.out.println ("You selected division, the ANSWER is " + (int)answer);
					else
						System.out.printf("You selected division, the ANSWER is %4.2f\n", answer);
				}
			}
		} else   // an invalid operation
		{
			System.out.println("You selected an invalid operation");
		}

		System.out.println("Thank you for using the BuzyBot calculator. Goodbye.");

	} // end of main

} // end of BuzyBotCalculator
