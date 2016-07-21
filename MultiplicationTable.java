// This program prints out a multiplication table up to 9's

public class MultiplicationTable
{

	public static void main(String[] args)
	{
		// Display the table heading
		System.out.println ("\t\tMultiplication Table");
		
       // Display the number title and underline
		System.out.print ("    ");
		for (int j = 1; j <= 9; j++)
		{
		   System.out.print ("   " + j);
		}
		System.out.println ("\n-------------------------------------------");
		
		// Display table body
		for (int i = 1; i <=9; i++)
		{
			System.out.print (i + " | ");
			for (int j = 1; j <=9; j++)
			{
				// Display the product and align properly
				System.out.printf ("%4d", i * j);
			}
			System.out.println ();
		}
	}
}
