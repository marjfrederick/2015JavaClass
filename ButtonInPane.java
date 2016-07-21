// This program creates a Window Titled "Button in a pane" and adds a
// non-functioning button in the center

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application
{
	@Override  // Override the start method in the Application class
    public void start (Stage primaryStage)
    {
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button ("OK"));
		Scene scene = new Scene (pane, 200, 50);
		primaryStage.setTitle("Button in a pane");  // set the stage title
		primaryStage.setScene (scene);  // place the scene in the stage
		primaryStage.show();  // Display the stage
    }
	
	// The main method is only needed for the IDE
	public static void main(String[] args)
	{
		Application.launch (args);
	}  // end main

} // end of class ButtonInPane
