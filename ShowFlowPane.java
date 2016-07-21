// This program creates a FlowPane with three non-functioning input fields

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;

public class ShowFlowPane extends Application
{
	@Override  // Override the start method in the Application class
    public void start (Stage primaryStage)
    {
		// Create a pane and set its properties
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets (11, 12, 13, 14));
		pane.setHgap(10);
		pane.setVgap(20);
		
		// Place nodes in the pane
		pane.getChildren().addAll(new Label ("First Name:"), 
			new TextField(), new Label("MI:"));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene (pane, 350, 200);
		primaryStage.setTitle("ShowFlowPane");  // set the stage title"
		primaryStage.setScene(scene);  // place the scene in the state
		primaryStage.show();  // Display the stage
    }
	
	// The main method is only needed for the IDE	
	public static void main(String[] args)
	{
		Application.launch (args);
	}  // end main

}  // end ShowFlowPane class
