/***********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 4 Assignment 1: Coffee Sales Tracker                                    *
 * Due 07/22/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program accepts the unit weight of a bag of coffee in pounds and the     *
 *  number of bags sold. The program will display the current date, the number    *
 *  of bags sold, the weight per bag, price per pound, the tax rate used, the     *
 *  sub-total, the tax charged, and the total price of the sale.                  *
 *                                                                                *                                                  *                                                                             
 * ********************************************************************************/
package cst;

import java.util.Scanner; // Imports the Scanner object used for user prompts
import java.util.Date;  // Imports the date class

public class CoffeeSalesTracker
{	
	public static void main(String[] args)
	{
		// declare local variables
		String inputStr;
		int numberOfBags;
		String weightOfBag;
		
		// Welcome the user and give basic program instructions
		welcomeUser();		
	
		// prompt the user to start or end the program
		String beginEnd = promptUser ("\nAre you ready to begin Y/N? ");
		
		while ("Y".equals(beginEnd) || "y".equals(beginEnd))	
		{		
            // prompt the user for the number of bags and the weight of the bag
			inputStr = promptUser ("\nNumber of bags: ");
			numberOfBags = Integer.parseInt (inputStr);
			weightOfBag = promptUser ("Weight per bag: ");
			
			// output the results
			outputResults (numberOfBags, weightOfBag);
		   
			// prompt the user to start or end the program
			beginEnd = promptUser ("\n\nDo you have another sale to ring up Y/N? ");
	  	}
		
		// Thank the user for using the program
		exitMessage();

	}  // end main
	
//----------------------------------------------------------------------------------------
// method to Welcome the user and give basic instructions 
	public static void welcomeUser()
	{
	   // Introduce the Coffee Sales Tracker program
	   System.out.println("Welcome to the Coffee Sales Tracker");
	   System.out.println("\nThis program will calculate the amount due");
	   System.out.println("for your coffee sales transactions");		
		
	}

//----------------------------------------------------------------------------------------
//method that prompts user for and accepts input from the user and returns a string
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
// output the results
   public static void outputResults (int numberOfBags, String weightOfBagStr)
   {
	   Date today = new Date();
	   
       /* display formatted date using printf, where B: full month name, 
	      e: 2 digit day w/o leading zeros and Y: 4-digit year
	      The "t" indicates the start of the date parse and < means continue to parse the date */
       System.out.printf("\n%-20s %tB %<te, %<tY", 
                         "Today's date:", today);
       
       // Display the Number of bags and weight of each bag
       System.out.printf("\n%-21s%-20d", "Number of bags:", numberOfBags);
       System.out.printf("\n%-21s%s %s", "Weight per bag:", weightOfBagStr, "pounds");
 
       // create a coffee object
       Coffee c = new Coffee(numberOfBags, Double.parseDouble (weightOfBagStr));
       
       // Output the Coffee sales information
       System.out.printf("\n%-21s$%-2.2f", "Price per pound:", c.getPrice());
       System.out.printf("\n%-21s%-2.2f%%", "Sales tax:", (c.getTaxRate()*100.0));
       System.out.printf("\n%-21s$%-4.2f", "Sales sub-total:", (c.getSale()));
       System.out.printf("\n%-21s$%-4.2f", "Total tax:", (c.getSalesTax()));  
       System.out.printf("\n\n%-21s$%-4.2f", "Total Sale:", (c.getTotalPrice()));
       
   }
   
//----------------------------------------------------------------------------------------
	// exit Message 
    public static void exitMessage ()
	{
	   System.out.println("\nThank you and have a great day. Goodbye.");
    }
    
}  // end of CoffeeSalesTracker class