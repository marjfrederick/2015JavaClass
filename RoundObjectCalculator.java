/***********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 3 Assignment 1: Round Object Calculator                                 *
 * Due 07/08/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program is a mult-use calculator that calculates the area of a circle    *
 *  or the volume of a sphere. The calculations will be based on the user input   *
 *  radius.                                                                       *
 *  Formulas:   Area = PI * radius * radius                                       *
 *              Volume = (4/3) * PI * radius * radius * radius                    *
 *                                                                                *                                                  *                                                                             
 * ********************************************************************************/

import java.util.Scanner; // Imports the Scanner object used for user prompts

public class RoundObjectCalculator
{
	public static void main(String[] args)
	{		
		// declare variables
		String radiusStr;
		double radius;
		
		// Introduce the Round Object program
		System.out.println("Welcome to the Round Object Calculator");
		System.out.println("This program will calculate the area of a circle");
		System.out.println("   or the volume of a sphere.");
		System.out.println("The calculations will be based on the user input radius.");
		
		// Initialize the Do-While condition to "don't test again"
		String testAgain = "N";
		do
		{		
		   // prompt user for the type of calculation
		   String circleOrSphere = promptUser("\nEnter C for circle or S for sphere: ");
		
		   if ("S".equals(circleOrSphere) || "s".equals(circleOrSphere))
		   {
		      // prompt user for the radius
			   radiusStr = promptUser("\nThank you. What is the radius of the sphere (in inches): ");
			   
				//Convert the string to a numeric value to preserve the user's input
				radius = Double.parseDouble (radiusStr);
		   
		      // calculate the volume
		      double volume = calculateVolume (radius);
		   
		      // output the result
		      outputResult (circleOrSphere, radiusStr, volume);
		   }
		   else if ("C".equals(circleOrSphere) || "c".equals(circleOrSphere))
		   {
		      // prompt user for the radius
			   radiusStr = promptUser("\nThank you. What is the radius of the circle (in inches): ");
					   
		  	  //Convert the string to a numeric value to preserve the user's input
			  radius = Double.parseDouble (radiusStr);		      
		   
		      // calculate the area
		      double area = calculateArea (radius);
		   
		      // output the result of the calculation
		      outputResult (circleOrSphere, radiusStr, area); 

		   }
		   else
		   	System.out.println("Invalid type of calculation. Try again.");
		   
			// allow the user the opportunity to do another calculation
			testAgain = promptUser("\nDo you want to calculate another round object (Y/N): ");
			
		} while ("Y".equals(testAgain) || "y".equals(testAgain));	
		exitMessage("\nThank you for using the Round Object Calculator. Goodbye.");

	}  // end of main

//----------------------------------------------------------------------------------------
// method that prompts user for and accepts input from the user and returns a string
	public static String promptUser(String promptString)
	{
	   	   // Create the Scanner input Object
		   Scanner input = new Scanner(System.in);
		
		   // Prompt the user for the user and retrieve the input
		   System.out.print(promptString);	
		   
		   // input.nextLine() can't be used. It takes the "Return" from the previous input
		   return input.next();
	}

//----------------------------------------------------------------------------------------
// method that calculates the area of a circle 
   public static double calculateArea(double radius)
   {
	   return (Math.PI * radius * radius);
   }
   
//----------------------------------------------------------------------------------------
// method that calculates the volume of a sphere 
   public static double calculateVolume(double radius)
   {
	   return ((4.0/3.0) * Math.PI * radius * radius * radius);
   }  
   
//----------------------------------------------------------------------------------------
// output the result of the calculation method to 3 decimal places
   public static void outputResult(String operation, String radius, double calculation)
   {
	   if ("S".equals(operation) || "s".equals(operation))
	   {
		   System.out.printf("\nThe volume of a sphere with a radius of %s inches is: "
		   		+ "%6.3f cubic inches.\n", radius, calculation);
	   }
	   else 
	   {
		   System.out.printf("\nThe area of a circle with a radius of %s inches is: "
			   		+ "%6.3f square inches.\n", radius, calculation);		   
	   }
   } 
   
//----------------------------------------------------------------------------------------
// exit Message 
   public static void exitMessage (String message)
   {
		System.out.println(message);
   }
   
}  // end of RoundObjectCalculator class

