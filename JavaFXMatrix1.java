/**********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 4 Assignment 2: JavaFX Random Matrix                                    *
 * Due 07/29/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program creates a Random Matrix using JavaFX.                            *
 *  It first welcomes the user and gives the size of the matrix.  The user        *
 *  selects "Continue" to display the 10 x 10 matrix of random 0's & 1's.         *
 *  The numbers are centered in a text field.                                     *
 *  The user stops the program by closing the window.                             *
 *                                                                                *                                                                            
 * ********************************************************************************/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
//import javafx.scene.text.*;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.stage.Stage;
//import javafx.stage.WindowEvent;

public class JavaFXMatrix1 extends Application
{
	// These constants are in lieu of user input from either the command line or Swing window
	private static final int MATRIX_HEIGHT = 10;
	private static final int MATRIX_WIDTH = 10;

//--------------------------------------------------------------------------
	// method to greet the user
	private void greetUser(Stage welcome)
	{
		// Greet the user at the command line and give basic information about the program
		System.out.println ("Welcome to the Random Matrix program");
		System.out.println ("This program creates a matrix of random 0's & 1's");
		System.out.println ("The matrix size will be " + MATRIX_WIDTH +
						" by " + MATRIX_HEIGHT);
		System.out.println ("Close the matrix window to exit the program.");

		/*
		// Create a dialog stage that has control until the user delete the dialog
		welcome = new Stage();
		welcome.setTitle("Welcome");  // set the stage title"
				
		// Create a VBox and add the Welcome and program information text
		VBox vBox = new VBox(5);  // 5 pixels between labels
		vBox.setPadding(new Insets (15, 15, 15, 15));
		
        // Create a scene  
		Scene scene = new Scene (vBox, 375, 130);
		
		// Create the text labels
		Label[] info = {new Label ("Welcome to the Random Matrix program"),
				new Label ("This program creates a matrix of random 0's & 1's"),
				new Label ("The matrix size will be " + MATRIX_WIDTH +
						" by " + MATRIX_HEIGHT)};
		for (Label i: info)
		{
			// Add a margin: top:0, left:0, bottom:0, right:15
			VBox.setMargin (i, new Insets(0, 0, 0, 15));
			vBox.getChildren().add(i);
		}	
		
		// Create the "Continue" button
		Button btn = new Button ("Continue");
		vBox.setMargin (btn, new Insets (0, 0, 0, 120));
		vBox.getChildren().add(btn);
		
		// Process evens
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				System.out.println("Random Matrix generated!");
			}				
		});
		*/
	}

//--------------------------------------------------------------------------
	// method to create the Matrix of width x height random 0's & 1's
	private void createMatrix(int width, int height, Stage primaryStage)
	{
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets (10, 10, 10, 10)); // border padding
		pane.setHgap(5);  // horizontal gap of grid in pixels
		pane.setVgap(5);  // vertical gap of grid in pixels
		
		// Place nodes in the pane
		for (int i = 0; i < MATRIX_WIDTH; i++)
		{
			for (int j = 0; j < MATRIX_HEIGHT; j++)
			{
				pane.add(createCell(), i, j);
			}
		}
		
        // Create a scene and place it in the stage
		Scene scene = new Scene (pane);
		primaryStage.setTitle("Exercise14_07");  // set the stage title"
		primaryStage.setScene(scene);  // place the scene in the state
		primaryStage.show();  // Display the stage
		
	}  // end of createMatrix method
//--------------------------------------------------------------------------    
	// method to create a cell (TextField) to hold a random number
	private TextField createCell()
	{
		double randomNo = Math.random();     // create the random number
		
		// round the number to 0 or 1, cast it to an Int and create a string
		String zeroOrOne = Integer.toString((int) Math.round(randomNo)); 
		
		// Create the text field with the zeroOrOne string added
		TextField field = new TextField (zeroOrOne);
		field.setPrefColumnCount(1);   // fix the size of the column to 1
		field.setAlignment(Pos.CENTER); // center the number
		return field;
		}
//--------------------------------------------------------------------------
		
	@Override  // Override the start method in the Application class
    public void start (Stage primaryStage)
    {
		// Greet the User & Give information about the program
		greetUser(primaryStage);
		
		// Creates the matrix and displays it
        createMatrix (MATRIX_WIDTH, MATRIX_HEIGHT, primaryStage);	        
    }
	
	// The main method is only needed for the IDE	
	public static void main(String[] args)
	{
		Application.launch (args);
	}  // end main

}  // end JavaFXMatrix1 class
