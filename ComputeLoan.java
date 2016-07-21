// This program computes the monthly payment and total payment of a loan
import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// Create a Scanner object to get input data
		Scanner input = new Scanner (System.in);
		
		//Enter annual interest rate in percentage e.g. 5.75%
		System.out.print ("Enter annual interest rate, e.g., 5.75%: ");
		double annualInterestRate = input.nextDouble();
		
		// Calculate the monthly interest rate: 0.0575/12
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Enter the number of years for the loan
		System.out.print ("Enter the number of years for your loan as an integer, e.g., 15: ");
        int numberOfYears = input.nextInt();
        
        // Enter loan amount
        System.out.print ("Enter loan amount, e.g., 120500.95: ");
        double loanAmount = input.nextDouble ();
        
        // Calculate monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1
        		- 1 / Math.pow (1 + monthlyInterestRate, numberOfYears * 12));
        
        // Calculate the total payment
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        // Display results
        System.out.println ("The monthly payment is $" + 
           (int)(monthlyPayment * 100) / 100.0);
        System.out.println ("The total payment is $" + 
                (int)(totalPayment * 100) / 100.0);
	}

}
