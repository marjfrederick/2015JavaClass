// This program creates a Window Titled "Font Circle Demo" and adds a
// circle with an italicized "Times New Roman" font "JavaFX" in the center

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class FontCircleDemo extends Application
{
	@Override  // Override the start method in the Application class
    public void start (Stage primaryStage)
    {
		// Create a pane to hold the circle
		StackPane pane = new StackPane();
		
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill (new Color (0.5, 0.5, 0.5, 0.1));
		pane.getChildren().add (circle);   //Add circle to the pane
		
		// Create a label and set its properties
		Label label = new Label ("JavaFX");
		label.setFont (Font.font ("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 20));
		pane.getChildren().add(label);   // Add the label to the pane
		
		// Create a scene and place it in the stage
		Scene scene = new Scene (pane, 200, 200);
		primaryStage.setTitle("FontCircleDemo");  // set the title of the stage
		primaryStage.setScene (scene);  // Place the scene in the stage
		primaryStage.show();  // Display the stage
    }
	
	// The main method is only needed for the IDE	
	public static void main(String[] args)
	{
		Application.launch (args);
	}  // end main

}  // end FontCircleDemo class
