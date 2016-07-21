package JavaFXMatrixEnhanced;
/**********************************************************************************
 * Course: CSC 240 Java Programming                                               *
 * Instructor: Carmella Garcia                                                    *
 * Module 5 Assignment 1: JavaFX Random Matrix Enhanced with Buttons              *
 * Due 08/05/15                                                                   *
 * Author: Marj Frederick                                                         *
 *                                                                                *
 *  This program creates a Random Matrix using JavaFX.                            *
 *  It first welcomes the user and gives the size of the matrix.  The user        *
 *  selects "Continue" to display the 10 x 10 matrix of random 0's & 1's.         *
 *  The numbers are centered in a text field.                                     *
 *  The user has the option to modify the matrix by selecting one of 3 buttons:   *
 *  Button 1: Reset the matrix to all zeros                                       *
 *  Button 2: Reset the matrix to all ones                                        *
 *  Button 3: Reset the matrix to another random matrix                           *
 *  To quit the user selects the Quit button or presses the Escape key.           *
 *                                                                                *                                                                            
 * ********************************************************************************/
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXMatrixEnhanced extends Application
{
	// These constants are in lieu of user input from either the command line or Swing window
	private static final int MATRIX_HEIGHT = 10;
	private static final int MATRIX_WIDTH = 10;

	private int matrixWidth = MATRIX_HEIGHT;
	private int matrixHeight = MATRIX_WIDTH;
	
	// Initialize the matrix cell type: R = Random, Z = zero or O = one
	String cellType = "R";
	
	// Create a border pane to hold the buttons and matrix
	BorderPane bPane;
	GridPane gPane;

	// default constructor
	public JavaFXMatrixEnhanced()
	{
		bPane = new BorderPane();
		bPane.setStyle ("fx-border-color:navy; -fx-background-color: orange");
		gPane = createMatrix(matrixWidth, matrixHeight, cellType);
	}
	// constructor to create the Random Matrix
	public JavaFXMatrixEnhanced(int width, int height, String cellType)
	{
		// Set the width and height of the matrix class data fields
		setMatrixWidth (width);
		setMatrixHeight (height);
		
		// create the border pane that contains the matrix & buttons
		bPane = new BorderPane();
		bPane.setStyle ("fx-border-color:navy; -fx-background-color: orange");
		
        // create the Matrix
		gPane = createMatrix(width, height, cellType);
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
//------------------------------------------------------------------------------		
	@Override  // Override the start method in the Application class
    public void start (Stage primaryStage)
    {
		// Greet the User & Give information about the program
		greetUser();
		
		// Create a Random 10 x 10 matrix - default
		JavaFXMatrixEnhanced matrix = new JavaFXMatrixEnhanced ();		
		
		//Place nodes in the border pane
		bPane.setTop(getHBox(matrix));
		bPane.setCenter(matrix.gPane);
		Button btn = getQuit(primaryStage);
		bPane.setBottom(btn);
		bPane.setAlignment(btn, Pos.CENTER);
						
		// Create a scene and place it in the stage
		Scene scene = new Scene(bPane);
		
		// Create an register an event handler to end with the ESC key
		scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>()
		{
		     @Override
		     public void handle(KeyEvent ke)
		     {
		         if(ke.getCode()==KeyCode.ESCAPE)
		         {
		             primaryStage.close();  // close the stage
		         }
		      }
		 });
		
		primaryStage.setTitle("Exercise14_07 Enhanced");  // set the stage title"
		primaryStage.setScene(scene);  // place the scene in the state
		primaryStage.show();  // Display the stage		
    }

//--------------------------------------------------------------------------
	// method to greet the user
	private void greetUser()
	{
		// Greet the user at the command line and give basic information about the program
		System.out.println ("Welcome to the Random Matrix program");
		System.out.println ("This program creates a matrix of random 0's & 1's");
		System.out.println ("The matrix size will be " + MATRIX_WIDTH +
						" by " + MATRIX_HEIGHT);
		System.out.println ("You can change the matrix by selecting a button at the top");
		System.out.println ("You can quit using the Quit button or the Escape (ESC) key");
	}

//--------------------------------------------------------------------------
	// method to create the Matrix of width x height
	public GridPane createMatrix(int width, int height, String cellType)
	{		
		// Create a pane and set its properties
		gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane.setPadding(new Insets (10, 10, 10, 10)); // border padding
		gPane.setHgap(5);  // horizontal gap of grid in pixels
		gPane.setVgap(5);  // vertical gap of grid in pixels
		
		// Place nodes in the pane
		for (int i = 0; i < MATRIX_WIDTH; i++)
		{
			for (int j = 0; j < MATRIX_HEIGHT; j++)
			{
				gPane.add(createCell(cellType), i, j);
			}
		}
		return gPane;
		
	}  // end of createRandomMatrix method
//--------------------------------------------------------------------------    
	// method to create a Matrix cell (TextField)
	private TextField createCell(String cellType)
	{
		String zeroOrOne = "1";  // Make default string = 1
		
		// create a random number
		if ("R".equals(cellType))
		{
	     	// round the number to 0 or 1, cast it to an Int and create a string
	   	    zeroOrOne = Integer.toString((int) Math.round(Math.random()));
		}
		else if ("Z".equals(cellType))
		{
			zeroOrOne = "0";
		}

		// Create the text field with the zeroOrOne string added
		TextField field = new TextField (zeroOrOne);
		field.setPrefColumnCount(1);   // fix the size of the column to 1
		field.setAlignment(Pos.CENTER); // center the number
		field.setStyle("-fx-font: 12 arial; -fx-font-weight: bold; "
				+ "-fx-text-fill: brown; -fx-control-inner-background: #faebd7;");
		
		return field;
	}
//--------------------------------------------------------------------------
	// method to create the HBox that contains the 3 top buttons
	private HBox getHBox(JavaFXMatrixEnhanced matrix)
	{
		HBox hBox = new HBox (15);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setStyle("-fx-background-color: blue");
		Button bt0 = new Button("Reset all to 0");
		bt0.setStyle("-fx-font: 12 arial; -fx-font-weight: bold; "
				+ "-fx-text-fill: brown; -fx-base: #faebd7;");
		hBox.getChildren().add(bt0);
		Button bt1 = new Button("Reset all to 1");
		bt1.setStyle("-fx-font: 12 arial; -fx-font-weight: bold; "
				+ "-fx-text-fill: brown; -fx-base: #faebd7;");
		hBox.getChildren().add(bt1);
		Button btR = new Button("Reset Randomly");
		btR.setStyle("-fx-font: 12 arial; -fx-font-weight: bold; "
				+ "-fx-text-fill: brown; -fx-base: #faebd7;");
		hBox.getChildren().add(btR);
		
		// Create and register the handler for the All Zeros button
		bt0.setOnAction(e -> changeMatrix(matrix.getMatrixWidth(), 
				matrix.getMatrixHeight(), "Z"));
		
		// Create and register the handler for the All Ones button
		bt1.setOnAction(e -> changeMatrix(matrix.getMatrixWidth(), 
				matrix.getMatrixHeight(), "O"));
		
		// Create and register the handler for the Random 0's & 1's button
		btR.setOnAction(e -> changeMatrix(matrix.getMatrixWidth(), 
				matrix.getMatrixHeight(), "R"));
		return hBox;
	}
//--------------------------------------------------------------------------
	// method to create the quit button at the bottom
	private Button getQuit(Stage primaryStage)
	{
		Button quitBtn = new Button ("Quit");
		quitBtn.setStyle("-fx-font: 12 arial; -fx-font-weight: bold; "
				+ "-fx-text-fill: brown; -fx-base: #faebd7;");
		
		// process the quit event
		quitBtn.setOnAction(e->primaryStage.close());
		
		return quitBtn;		
	}
//--------------------------------------------------------------------------
	private void changeMatrix (int width, int height, String cellType)
	{
		gPane = createMatrix(width, height, cellType);
		bPane.setCenter(gPane);
				
	}
//--------------------------------------------------------------------------	
	// The main method is only needed for the IDE	
	public static void main(String[] args)
	{
		Application.launch (args);
	}  // end main

}  // end JavaFXMatrixEnhanced class
//-------------------------------------------------------------------------
