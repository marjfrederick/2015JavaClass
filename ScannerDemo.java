// This program reads first and last name strings from the console & formats: Your name is first last

import java.util.*;

public class ScannerDemo
{

   public static void main(String[] args)

   {

      // Declare variables
      String lastName;
      String firstName;

      Scanner getInfo = new Scanner(System.in); // Create scanner object

      System.out.print("Enter your last name: "); // Prompt user

      lastName = getInfo.nextLine(); // Accept user input

      System.out.println(" "); // Go to next line

      System.out.print("Enter your first name: "); // Prompt user

      firstName = getInfo.nextLine(); // Accept user input

      System.out.println(" "); // Go to next line

     // System.out.println("Your name is: " + lastName + ", " + firstName); // Output result
      System.out.println("Your name is: " + firstName + " " + lastName); // Output result

   }

}