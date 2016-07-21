/*********************************************************************************
 * Course: CSC 240 Java Programming                                              *
 * Instructor: Carmella Garcia                                                   *
 * Module 1 Assignment 2: Flash Card Math Tutor                                  *
 * Due 06/17/15                                                                  *
 * Author: Marj Frederick                                                        *
 *                                                                               *
 *  This program prompts the user to answer an addition problem:                 *
 *  The program generates two random integer numbers between 1 and 100 and       *
 *  presents them to the user as an addition problem to solve. The program gives * 
 *  the correct answer to the addition problem for the user to check if their    *
 *  calculation was correct, then thanks the user for using the program.         *
 *                                                                               *                                  
 * *******************************************************************************/

import java.util.Scanner;    // Imports the Scanner object used for user prompts

public class JavaAdditionFlashCard
{
	public static void main(String[] args)
	{		
		// Create the Scanner input Object
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Welcome to Java Addition Flashcard");
		System.out.println ("This program will ask you to answer an addition problem");
		
		// Generate two random numbers between 1 & 100:  a + Math.random() * b  a <= genNum < b
		int num1 = 1 + (int) (Math.random () * 100);
		int num2 = 1 + (int) (Math.random () * 100);
		
		// Calculate the sum
		int sum = num1 + num2;
		
		// Prompt the user to add the two numbers
		System.out.print ("What is " + num1 + " + " + num2 + "? ");	
		int sumGuess = input.nextInt ();
					
		// Output the actual sum
		System.out.println ("The answer is " + sum + ".");
		System.out.println ("Goodbye and thank you for using this program.");

	}  // end of main

}  // end of JavaAdditionFlashCard class

