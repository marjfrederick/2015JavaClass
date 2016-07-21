/**********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 2 Assignment 2: Loan Amortization Calculator                            *
 * Due 07/01/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program is a mult-use loan amortization calculator. The user is prompted *
 *  to enter the loan amount, the number of months for the loan and the quoted    *
 *  APR (annual percentage rate). The program calculate the monthly payment,      *
 *  the total amount that will be paid including interest and the Amortization    *
 *  Schedule for each month until the loan is completely paid.                    *
 *                                                                                *
 *  monthly payment = P * r * (1 + r)^n / [(1 + r)^n - 1]                         *
 *                                                                                *
 *  where P: principle,  r = interest rate = % / 100, and n = number of months    *
 *                                                                                *
 *  total amount paid = monthly payment * number of months                        *
 *                                                                                *                                                  *                                                                             
 * ********************************************************************************/

import java.util.Scanner; // Imports the Scanner object used for user prompts

public class LoanCalculator
{
	public static void main(String[] args)
	{
		// Create the Scanner input Object
		Scanner input = new Scanner(System.in);
		
		// Declare variables outside the loop
        double principal; double monthlyIntRate; double monthlyPayment;
		double monthlyPaymentRd; double interest; double balance;
		int numberOfMonths;

		// Introduce the amortization program
		System.out.println("Welcome to the Loan Amortization Program of XYZ Banking");
		System.out.println("This program will help you determine the payment structure");
		System.out.println("   of your loan.");
		System.out.println("Let us get started:\n");
		
		// Initialize the Do-While condition to "don't test again"
		String testAgain = "N";
		do
		{
			// prompt the user for the loan amount (principal)
			System.out.print("Enter the loan amount you are requesting: $");
			principal = input.nextDouble();
			
			// prompt for the number of months for the loan
			System.out.print("Enter the number of months for the loan: ");
	        numberOfMonths = input.nextInt();
	        
	        // prompt for the APR
			System.out.print("Enter the APR you have been quoted: "); 
			// double annualPercentageRate = input.nextDouble();
			monthlyIntRate = input.nextDouble() / 1200.;
			
			// Calculate and printout the monthly payment & total paid rounded to 2 decimal places
			monthlyPayment = (principal * monthlyIntRate * 
					Math.pow(1 + monthlyIntRate, numberOfMonths)) /
					(Math.pow(1 + monthlyIntRate, numberOfMonths) - 1);
			monthlyPaymentRd = Math.round(monthlyPayment * 100.0) / 100.0;
		    System.out.printf("\nThe monthly payment will be $%5.2f", monthlyPaymentRd);			
			System.out.printf("\nThe total paid (with interest) will be $%6.2f", 
					(monthlyPaymentRd * numberOfMonths));
			
			// Calculate and printout the Amortization Schedule to 2 decimal places
			System.out.print("\n\nYour Amortization Schedule\n");
			System.out.printf("\n%-13s%-14s%-14s%-14s", "Payment#", "Interest", "Principal", "Balance");
			balance = principal;
			for (int i = 1; i <= numberOfMonths; i++)
			{
				interest = balance * monthlyIntRate;
				principal = monthlyPayment - interest;
				balance = balance - principal;
				
				System.out.printf("\n%-13d$%-13.2f$%-13.2f$%-13.2f",i, 
						(Math.round((interest) * 100.0) / 100.0),
						(Math.round((principal) * 100.0) / 100.0),
						(Math.round((balance) * 100.0) / 100.0));
			}
			
			// allow the user the opportunity to do another loan amortization or quit
			System.out.print("\n\nWould you like to calculate another loan (Y/N): ");
			testAgain = input.next();  // input.nextLine() can't be used. It takes the "Return" from the previous input
			
		} while ("Y".equals(testAgain) || "y".equals(testAgain));
		
		//Thank the user for using the Loan Calculator program
		System.out.println("Thank you for using the Loan Amortization Program from XYZ Banking.");
		System.out.println("Goodbye.");
		
	} // end of main
}  // end of LoanCalculator class
