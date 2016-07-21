// This program tests the different loop mechanisms: for, while, do-while
// To make equivalent loops       5.5 p. 175

public class TestLoops {

	public static void main(String[] args)
	{
		// While Loop
		int i = 1;
		int sum = 0;
		while (sum < 10)
		{
			sum = sum + i;
			i++;
		}
       System.out.println ("while loop: i = " + i + " and sum = " + sum);
        
        // Equivalent for Loop
        sum = 0;
        for (i = 1; sum < 10; i++)  
        {
        	sum = sum + i; 
        }
        System.out.println ("for loop: i = " + i + " and sum = " + sum); 
        
        // Equivalent do-while Loop
        i = 0;
        sum = 0;
        do
        {
        	sum = sum + i; 
        	i++;
        } while (sum < 10);
        System.out.println ("do-while loop: i = " + i + " and sum = " + sum); 
	}
}
