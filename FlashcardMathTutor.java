/*********************************************************************************
 * Course: CSC 240 Java Programming                                              *
 * Instructor: Carmella Garcia                                                   *
 * Module 1 Assignment 2: Flashcard Math Tutor                                   *
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

public class FlashcardMathTutor
{
	public static void main(String[] args)
	{		
		// Create the Scanner input Object
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Welcome to Java Addition Flashcard");
		System.out.println ("This program will ask you to answer an addition problem");
		
		// Generate two random numbers between 1 & 100:  a + Math.random() * b  a <= genNum < b
		int randomNum1 = 1 + (int) (Math.random () * 100);
		int randomNum2 = 1 + (int) (Math.random () * 100);
		
		// Calculate the sum of the 2 random numbers
		int sum = randomNum1 + randomNum2;
		
		// Prompt the user to add the two numbers
		System.out.print ("What is " + randomNum1 + " + " + randomNum2 + "? ");	
		int guessSum = input.nextInt ();
					
		// Output the actual sum and tell the user if they are correct in their addition
		if (guessSum == sum)
		{
			System.out.println ("You are correct. The answer is " + sum + ".");
		}
		else
			System.out.println ("Your answer is " + guessSum + ". The correct answer is " + sum + ".");
		System.out.println ("Goodbye and thank you for using this program.");

	}  // end of main

}  // end of FlashcardMathTutor class

