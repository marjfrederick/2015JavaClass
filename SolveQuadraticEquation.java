// This program solves a Quadratic Equation Ax^2 + Bx + C = 0 using the Quadratic Formula
import java.util.Scanner;

public class SolveQuadraticEquation {

	public static void main(String[] args) {
		// Create a Scanner object to retrieve input values
		Scanner input = new Scanner (System.in);
		
		// Prompt the user to enter A, B & C of the equation Ax^2 + Bx + C = 0
        System.out.print ("Enter A, B & C of your Quadratic Equation: Ax^2 + Bx + C = 0: ");
        double A = input.nextDouble ();
        double B = input.nextDouble ();
        double C = input.nextDouble ();
        System.out.println ("A = " + A);
        System.out.println ("B = " + B);
        System.out.println ("C = " + C);
        
        double discriminant = Math.pow(B, 2) - 4 * A * C;
        /* System.out.println ("discriminant = " + discriminant);  for debugging */
        
        double x1 = (-B + Math.sqrt (discriminant)) / (2 * A);
        double x2 = (-B - Math.sqrt (discriminant)) / (2 * A);
        
        // Print the Results
        System.out.println ("The values of x = " + x1 + ", " + x2);
	}

}
