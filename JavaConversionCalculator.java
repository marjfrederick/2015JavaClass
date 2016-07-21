/*********************************************************************************
 * Course: CSC 240 Java Programming                                              *
 * Instructor: Carmella Garcia                                                   *
 * Module 1 Assignment 1: Java Conversion Calculator                             *
 * Due 06/10/15                                                                  *
 * Author: Marj Frederick                                                        *
 *                                                                               *
 *  This program prompts the user for a measurement in feet and                  *
 *  then converts this measurement to meters rounded to 3 decimal places.        * 
 *                                                                               *                                  
 * *******************************************************************************/

import java.util.Scanner;    // Imports the Scanner object used for user prompts

public class JavaConversionCalculator
{
	public static void main(String[] args)
	{		
		// Create the Scanner input Object
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Welcome to the Java Conversion Calculator");
		System.out.println ("This program will convert feet measurements to meters.");
		
		// Prompt the user to input a measurement in feet
		System.out.print ("Enter the number of feet to convert, e.g. 56: ");
		// use a string to output the value exactly as user input, with or without decimals
		String inputFeet = input.nextLine ();  
		
		//Convert the string to a numeric value
		double feet = Double.parseDouble (inputFeet);
		
		// Calculate meters using the formula: meters = feet / 3.2808
		double meter = feet / 3.2808;
		
		// Output the result of the conversion
		System.out.printf ("%s feet is equal to %4.3f meters.\n", inputFeet, meter);
		System.out.println ("Goodbye and thank you for using this conversion calculator.");

	}  // end of main

}  // end of JavaConversionCalculator class
