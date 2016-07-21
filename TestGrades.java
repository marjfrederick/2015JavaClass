
public class TestGrades
{

	public static void main(String[] args)
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
	     // prompt the user for the of student grades to be entered
		System.out.print ("Enter the number of student grades to be entered: ");
		int noOfStudents = input.nextInt();
		
		// Create the array based on the number of students 
		float[] testGrades = new float[noOfStudents];
		
		// loop through the array and have the user input the grades
		for (int i = 0; i< testGrades.length; i++)
		{
			System.out.print ("Enter test grade" + (i+1) + ": ");
			testGrades[i] = input.nextFloat();
		}
		
		// calculate the average grade and output it to the user
		System.out.println ("The average grade is: " + computeAvg(noOfStudents, testGrades));	

	} // end of main
//--------------------------------------------------------------------------
	// method to compute the Average of all the test grades
	public static float computeAvg (int noOfStudents, float[] grades)
	{
		float total = 0; // initialize the variable
		
		// loop through the array and add all of the grades
		for (int i = 0; i < grades.length; i++)
			total += grades[i];
		return (total/noOfStudents);
	}

} // end of TestGrades class
