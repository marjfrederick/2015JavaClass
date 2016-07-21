//This application program demonstrates augmented assignment operators
public class AugmentedAssignmentOperators
{

	public static void main(String[] args) {
		System.out.println( "Augmented Assignment Operators");

		int x = 1;;
		System.out.println ("x = " + x);
		x += 2;
		System.out.println ("x += 2 = " + x);
		System.out.println ("x += 2 as an expression in a print: ");
		System.out.println (x += 2);
		
		double a = 6.5;
		System.out.println(" ");
		System.out.println ("a = " + a);
        a += a + 1;
    	System.out.println ("a += a + 1 = " + a);  
    	a = 6;
    	System.out.println ("a = " + a);
    	a /=2;
    	System.out.println ("a /= 2 = " + a);
    	
    	//Increment & Decrement
    	int i = 1;
		System.out.println(" ");
		System.out.println ("i = " + i);
    	i++;
    	System.out.println ("i++ = " + i);
    	
    	int b = 6;
		System.out.println(" ");
    	System.out.println ("b = " +b);
    	int c = b++;
    	System.out.println ("Postdecrement: c = b++, b = " +b);
    	System.out.println ("c = " +c);
    	b = 6;
    	System.out.println(" ");
    	System.out.println ("b = " +b);
    	c = ++b;
    	System.out.println ("Predecrement: c = ++b, b = " +b);
    	System.out.println ("c = " +c);
	}

}

