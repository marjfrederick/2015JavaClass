// This program allows the user to practice their addition of 2 numbers.
// The 2 numbers are randomly generated
// If they get the addition problem wrong, they get to try again until they get it correct.

import java.util.Scanner;

public class RepeatAdditionQuiz 
{
	public static void main(String[] args)
	{
		// randomly generate two numbers from 0 - 9 to add
		int number1 = (int) (Math.random () * 10);
		int number2 = (int) (Math.random () * 10);	
		
		// Create a Scanner object to handle any input
		Scanner input = new Scanner (System.in);

        // Prompt the user to given the answer to the sum of the 2 numbers
		System.out.print ("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt ();
		
		while (number1 + number2 != answer)
		{
			System.out.print ("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt ();
		}
		System.out.println ("You got it!");
	}

}
