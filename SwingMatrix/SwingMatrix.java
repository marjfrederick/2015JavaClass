/***********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 4 Assignment 2: Swing Random Matrix                                     *
 * Due 07/29/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program creates a Random Matrix of 0's & 1's using Swing Components.     *
 *  It first welcomes the user and gives the size of the matrix.                  *
 *  The numbers are centered in a text field.                                     *
 *                                                                                *                                                                            
 * ********************************************************************************/
package SwingMatrix;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingMatrix
{
	// These constants are in lieu of user input from either the command line or Swing window
	private static final int MATRIX_HEIGHT = 10;
	private static final int MATRIX_WIDTH = 10;
	
	private int matrixWidth = 0;
	private int matrixHeight = 0;

	// Create the window frame
	JFrame frame = new JFrame("Exercise14_07");

	// constructor to greet and create the Random Matrix
	public SwingMatrix(int width, int height)
	{
		// Set the width and height of the matrix class data fields
		setMatrixWidth (width);
		setMatrixHeight (height);
		
		// greet the user and create the Matrix
		greetUser();
		createMatrix();
	}  // end constructor

//--------------------------------------------------------------------------
	// get method to get the width of the matrix
	public int getMatrixWidth()
	{
		return matrixWidth;
	}

//--------------------------------------------------------------------------
	// get method to get the height of the matrix
	public int getMatrixHeight()
	{
		return matrixHeight;
	}

//--------------------------------------------------------------------------
	// set method to set the width of the matrix
	public void setMatrixWidth(int matrixWidth)
	{
		this.matrixWidth = matrixWidth;
	}

//--------------------------------------------------------------------------
	// set method to set the width of the matrix
	public void setMatrixHeight(int matrixHeight)
	{
		this.matrixHeight = matrixHeight;
	}

//--------------------------------------------------------------------------
	// method to greet the user
	private void greetUser()
	{
		// Greet the user at the command line and give basic information about the program
		System.out.println ("Welcome to the Random Matrix program");
		System.out.println ("This program creates a matrix of random 0's & 1's");
		System.out.println ("The matrix size will be " + getMatrixWidth() +
						" by " + getMatrixHeight());
		System.out.println ("Close the matrix window to exit the program.");

	} // end greetUser() method

//--------------------------------------------------------------------------
	// method to create the Matrix of width x height random 0's & 1's
	private void createMatrix()
	{
		// Create the container for the window
		JPanel panel = new JPanel();

		// Create a grid using the gridLayout & add it to the panel
		panel.setLayout(new GridLayout(getMatrixWidth(), getMatrixHeight()));
		
		// fill the grid with random 0's and 1's
		for (int i = 0; i < getMatrixWidth() * getMatrixHeight(); i++)
		{
			// creates a cell in the grid to hold a random number
			panel.add(createCell());
		}
		frame.add(panel);  // add the panel to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the exit action
		frame.setSize (325, 325);  // set the size of the frame
		frame.setLocationRelativeTo (null); // center the location
		frame.setVisible(true);  // displays the grid
	}

//--------------------------------------------------------------------------    
	// method to create a cell (JTextField) to hold a random number
	private JTextField createCell()
	{
		JTextField field = new JTextField();  // create the JTextField
		double randomNo = Math.random();     // create the random number
		int zeroOrOne = (int) Math.round(randomNo);  // round it to 0 or 1
		field.setText(Integer.toString(zeroOrOne));  // add the number to the JField
		field.setHorizontalAlignment(JTextField.CENTER);  // center the number
		return field;
	}

    // main creates the Swing version of the 10 x 10 matrix
	public static void main(String[] args)
	{

		// creates the new SwingMatrix of size
		new SwingMatrix(MATRIX_WIDTH, MATRIX_HEIGHT);

	}  // end main

}  // end class SwingMatrix

