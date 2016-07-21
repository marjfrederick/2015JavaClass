// This program computes the angles of a triangle given three 2-D points for the triangle vertices

import java.util.Scanner;

public class ComputeAnglesOfATriangle {

	public static void main(String[] args) {
		//Create a Scanner object to retrieve the dollar amount
		Scanner input = new Scanner (System.in);
		
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		// Prompt the user to enter three points for the vertices
		System.out.println("Enter the coordinates for the triangle vertices below:");

		System.out.print("Enter coordinate x1: "); // Ask for input
		x1 = input.nextDouble(); // Accept input

		System.out.println(" "); // These lines of code insert a blank line between inputs.

		System.out.print("Enter coordinate y1: "); // Ask for input
		y1 = input.nextDouble(); // Accept input

		System.out.println(" ");

		System.out.print("Enter coordinate x2: "); // Ask for input
		x2 = input.nextDouble(); // Accept input

		System.out.println(" ");

		System.out.print("Enter coordinate y2: "); // Ask for input
		y2 = input.nextDouble(); // Accept input

		System.out.println(" ");

		System.out.print("Enter coordinate x3: "); // Ask for input
		x3 = input.nextDouble(); // Accept input

		System.out.println(" ");

		System.out.print("Enter coordinate y3: "); // Ask for input
		y3 = input.nextDouble(); // Accept input

		System.out.println(" ");

		System.out.println("Thank you. I will now calculate the angles: ");
		
		// Compute the length of the three sides using the distance formula: sqrt ((x2 - x1)^2 + (y2 - y1)^2)
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	
		// Compute the three angles
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		// Display the triangle's angles in degrees
		System.out.println ("The three angles are " +
		    Math.round(A * 100) / 100.0 + " degrees, " +
		    Math.round(B * 100) / 100.0 + " degrees, & " +
		    Math.round(C * 100) / 100.0 + " degrees");
	}

}
