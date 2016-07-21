/* **********************************************************************************************
 * This program generates a random 2-digit number, prompts the user to enter a 2-digit number,  *
 * and determines whether the user wins according to the following rules:                       *
 *                                                                                              *
 * If the user input matches the lottery number in the exact order, the award is $10,000        *
 * If all digits in the user input match all digits in the lottery number the award is $3000    *
 * If one digit in the user input matches a digit in the lottery number, the award is $1000     *
 *                                                                                              *
 ************************************************************************************************/
import java.util.Scanner;

public class LotteryUsingStrings
{
	public static void main(String[] args)
	{		
		// Create an object to read the input
		Scanner input = new Scanner (System.in);
		
		// Generate a 2-digit lottery number
		String lottery = "" + (int) (Math.random () * 10) + (int) (Math.random () * 10);
		
		// Get digits form generated lottery number
		char lotteryDigit1 = lottery.charAt (0);
		char lotteryDigit2 = lottery.charAt (1);
		
		// Prompt the user to enter a 2-digit guess
		System.out.println ("Enter your 2-digit lottery pick: ");
		String guess = input.nextLine ();
					
		// Get digits form guess
		char guessDigit1 = guess.charAt (0);
		char guessDigit2 = guess.charAt (1);	
		
		System.out.println ("The lottery number is " + lottery);
		
		// Compare the guess to the lottery number and give the appropriate award
		if (guess.equals (lottery))
			System.out.println ("Exact match: you win $10,000!");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println ("Match all digits: you win $3000");
		else if (guessDigit1 == lotteryDigit1
			  || guessDigit1 == lotteryDigit2
			  || guessDigit2 == lotteryDigit1
			  || guessDigit2 == lotteryDigit2)
			System.out.println ("Match one digit: you win $1000");
		else
			System.out.println ("Sorry, no match.");			
	}
}
