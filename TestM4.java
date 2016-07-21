
public class TestM4
{
	public static void main(String[] args)
	{
		A a = new A();
		a.print();
	} // ends main	

} // ends TestM4 class

class A
{
	String s;  // data field
	
	// Default constructor
	A()
	{
	
	}
	
	// Constructor
	A(String s)
	{
		this.s = s;
	}
	// print method to class A
	void print()
	{
		System.out.print("s = " + s);
	}
	
} // end class A
