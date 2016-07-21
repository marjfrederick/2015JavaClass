/***********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 4 Assignment 2: Swing Random Matrix                                     *
 * Due 07/29/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program creates a Random Matrix using Swing Components.                  *
 *  It first welcomes the user and gives the size of the matrix.  The user        *
 *  selects "Continue" to display the 10 x 10 matrix of random 0's & 1's.         *
 *  The numbers are centered in a text field.                                     *
 *  The user stops the program by closing the window.                             *
 *                                                                                *                                                                            
 * ********************************************************************************/
package swingMatrixEventHandling;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingMatrixEventHandling
{
	// These constants are in lieu of user input from either the command line or Swing window
	private static final int MATRIX_HEIGHT = 10;
	private static final int MATRIX_WIDTH = 10;
	
	private int matrixWidth = 0;
	private int matrixHeight = 0;

	// The listener interface for receiving action events for the dialogBox button
	private final class DialogActionListener implements ActionListener
	{
		JDialog dialogBox = null; // initializing the reference

		// Constructor that sets the dialog object
		public DialogActionListener(JDialog jdialog)
		{
			dialogBox = jdialog;
		}

		@Override
		// Method that is invoked when an action occurs
		public void actionPerformed(ActionEvent e)
		{
			// Releases all of the native screen resources used by this Window
			dialogBox.dispose();
		}
	}  // end class DialogActionListener

	// Create the window frame
	JFrame frame = new JFrame("Exercise14_07");

	// constructor to greet and create the Random Matrix
	public SwingMatrixEventHandling(int width, int height)
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
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		// Creating a dialog box that is modal (it won't continue program execution until disposed)
		JDialog dialogBox = new JDialog(frame, "Welcome", true);
		
		dialogBox.setSize(375, 130);  // set size in pixels of the dialog box
		
		// Using an easy to use layout manager
		dialogBox.setLayout(new FlowLayout());
		
		// Adds a label to the dialog
		dialogBox.add(new JLabel("Welcome to the Random Matrix program"));
		dialogBox.add(new JLabel("This program creates a matrix of random 0's & 1's"));
		dialogBox.add(new JLabel ("The maxtrix size will be " +
		   getMatrixWidth() + " by " + getMatrixHeight()));
		dialogBox.add(new JLabel ("Close this window to generate the matrix"));

		/*  How to add a button and make it activate
		dialogBox.add(new JLabel ("Press Continue to generate the matrix"));
		
		// Create a "continue" button
		JButton continueBtn = new JButton("Continue");
		
		// Action performed when the button is pressed
		continueBtn.addActionListener(new DialogActionListener(dialogBox));
		
		// Add the "continue" button to the dialog box
		dialogBox.add(continueBtn);
		*/
		
		// make everything visible
		frame.setVisible(true);
		dialogBox.setVisible(true);
	}

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
		frame.pack();  // readjusts the size of the frame to fit the grid
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
		// create a runnable thread that is used to control the application
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				// creates the new SwingMatrix of size
				new SwingMatrixEventHandling(MATRIX_WIDTH, MATRIX_HEIGHT);
			}
		});

	}  // end main

}  // end class SwingMatrixEventHandling
