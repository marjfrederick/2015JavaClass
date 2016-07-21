// Allows the user to input a number for the month and then prints out the name of that
// month using an array of month names

public class favoriteMonth
{

	public static void main(String[] args)
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] month = {"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"};
		int monthIndex = 0;
		
		// prompt the user for the numbered month that is their favorite
		System.out.print ("Which month by number is your favorite?");
		monthIndex = input.nextInt();
		System.out.println ("Your favorite month is " + month[monthIndex - 1]);

	}

}
