// This program computes the minimum change in dollars, quarters, dimes, nickels & pennies given a dollar value
import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		//Create a Scanner object to retrieve the dollar amount
		Scanner input = new Scanner (System.in);
		
		// Retrieve the dollar amount
		System.out.print( "Enter an amount of money for computing change, e.g. 11.56: ");
		double amount = input.nextDouble ();
		
		int remainingAmount = (int)(amount * 100);
		
		// Find the number of one dollars & the remaining amount, e.g. $11 and 56
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount, e.g. 2 quarters and 6
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;		

		// Find the number of dimes & the remaining amount, e.g. 0 dimes and 6
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels & the remaining amount, e.g. 1 nickel and 1
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies
		int numberOfPennies = remainingAmount;
		
		// Display results
		System.out.println ("Your amount " + amount + " consists of");
		System.out.println ("    " + numberOfOneDollars + " dollars");
		System.out.println ("    " + numberOfQuarters + " quarters");
		System.out.println ("    " + numberOfDimes + " dimes");	
		System.out.println ("    " + numberOfNickels + " nickels");
		System.out.println ("    " + numberOfPennies + " pennies");
	}

}
