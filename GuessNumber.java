// This program allows the user to try and guess a generated random number between 0 & 100

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		// randomly generate one number from 0 - 100 
		int number = (int) (Math.random () * 101);

		// Create a Scanner Object for input
		Scanner input = new Scanner (System.in);
		System.out.println ("Guess a magic number between 0 and 100");
		
		int guess = 1;
		while (guess != number)
		{
			// Prompt the user to guess the number
			System.out.print ("\nEnter your guess: ");
			guess = input.nextInt ();
			
			if (guess == number)
				System.out.println ("Yes, the number is " + number);
			else if (guess > number)
				System.out.println ("Your guess is too high");
			else
				System.out.println ("Your guess is too low");
		} // end of loop
	}
}
