/***********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 3 Assignment 2: Inventory Tracker                                       *
 * Due 07/15/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program uses a loop to accept the names of ten items and the cost of     *
 *  each, stored in 2 parallel arrays. The program will then output the item      *
 *  name, cost and price (calculated using: itemCost(x) * 1.3) in a table.        *
 *                                                                                *                                                  *                                                                             
 * ********************************************************************************/

import java.util.Scanner; // Imports the Scanner object used for user prompts

public class InventoryTracker
{
	// Declare the number of stock items as a constant so it can be easily changed
	private static final int NO_OF_ITEMS = 10;
	
	public static void main(String[] args)
	{		
		// Initalize and allocate the arrays for the item names and cost
		String[] itemName = new String[NO_OF_ITEMS];
		String[] itemCost = new String[NO_OF_ITEMS];	
		
		// Welcome the user and give basic program instructions
		welcomeUser();		
	
		// prompt the user to start or end the program
		String beginEnd = promptUser ("\nEnter B to begin, E to end: ");

		while ("B".equals(beginEnd) || "b".equals(beginEnd))	
		{		
		   // prompt user for the name and cost of each item
		   for (int i = 0; i < NO_OF_ITEMS; i++)
		   {
			  itemName[i] = promptUser ("\nEnter product " + (i + 1) + " name: ");
			  itemCost[i] = promptUser ("Enter the item cost: $");
		   }
		   // table output
		   outputInventoryTable (itemName, itemCost);
		   
			// prompt the user to start or end the program
			beginEnd = promptUser ("\n\nEnter B to begin, E to end: ");
	  	}
		
		// Thank the user for using the program
		exitMessage();

	}  // end main
	
//----------------------------------------------------------------------------------------
// method to Welcome the user and give basic instructions 
	public static void welcomeUser()
	{
		// Introduce the Round Object program
		System.out.println("Welcome to the Inventory Tracker Program");
		System.out.println("This program will accept the names and costs for " 
		+ NO_OF_ITEMS + " stocked items.");
		System.out.println("The program will then output a table with the names, costs, and prices");		
		System.out.println("   of the items.");
		System.out.println("Prices are calculated with a 30% markup on cost.");
	}
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
// output the Inventory table and the total cost
	public static void outputInventoryTable (String[] itemName, String[] itemCost)
	{
		double price;
		double totalCost = 0.0;
		
	  	System.out.print ("\n|nInventory Table:\n");     // Table header
		System.out.printf("\n%-19s%-16s%-15s", "Item Name", "Item Cost", "Item Price");
	  	
		for (int i=0; i < NO_OF_ITEMS; i++)
		{
		    //Convert the string to a numeric value to preserve the user's input & calculate price of item
			price = calculatePrice (Double.parseDouble (itemCost[i]));
			
			// print out the table: item name, item cost and item marked up price
			System.out.printf("\n%-19s$%-15s$%-13.2f",itemName[i], itemCost[i], price);
			
			// accumulate the total cost of all of the goods
			totalCost = totalCost + price;
		}
		System.out.print ("\nThe total cost of goods = $" + (Math.round((totalCost) * 100.0) / 100.0));
	}
//----------------------------------------------------------------------------------------
	public static double calculatePrice (double cost)
	{
		return (cost * 1.3);
	}
//----------------------------------------------------------------------------------------
// exit Message 
    public static void exitMessage ()
	{
	   System.out.println("\nThank you for using the Inventory Tracker Program. Goodbye.");
    }
	 
} // end of InventoryTracker class
