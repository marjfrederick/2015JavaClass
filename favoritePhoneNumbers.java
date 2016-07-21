
public class favoritePhoneNumbers
{
	public static void main(String[] args)
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// create the array of integers indexed 0-4
		long[] favoritePhoneNos = new long[5];
		System.out.println ("Enter your top 5 favorite phone numbers, e.g. 3034852000");
		
		// loop through the array and have the user input their favorite numbers
		for (int i = 0; i< favoritePhoneNos.length; i++)
		{
			System.out.print ("Enter phone number" + (i+1) + ": ");
			favoritePhoneNos[i] = input.nextLong();
		}
		// Here is a list of your favorite numbers
		System.out.println ("Here is the list of your favorite numbers: ");
		for (int i = 0; i< favoritePhoneNos.length; i++)
			System.out.print (favoritePhoneNos[i] + "  ");		
	}

}
