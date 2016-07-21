// This program tests string outouts

public class TestStrings 
{

	public static void main(String[] args) 
	{
		System.out.println ("1" + 1);
		System.out.println ('1' + 1);          // '1' is 49 in unicode
		System.out.println ("1" + 1 + 1);
		System.out.println ("1" + (1 + 1));
		System.out.println ('1' + (1 + 1));   // '1' is 49 in unicode
	}

}
