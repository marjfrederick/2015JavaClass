import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class ShowPolygon extends Application
{
	// Class data
	final double WIDTH = 200;   // width of the polygon in pixels
	final double HEIGHT = 200;  // height of the polygon in pixels
	double centerX = (WIDTH + 20) / 2;
	double centerY = (HEIGHT + 20) / 2;
	double radius = Math.min(WIDTH,  HEIGHT) * 0.5;
	
	@Override  // Override the start method in the Application class
	public void start (Stage primaryStage)
	{
	   // Create a pane to hold the polygon
	   Pane pane = new Pane();
	   
	   // Create the polygon and add it to the pane & set its properties
	   Polygon polygon = new Polygon();
	   pane.getChildren().add(polygon);
	   polygon.setFill(Color.WHITE);
	   polygon.setStroke(Color.BLACK);
	   
	   // Get a list of points for the polygon
	   ObservableList<Double> list = polygon.getPoints();
	   
	   //Add points to the polygon list
	   for (int i=0; i<6; i++)
	   {
		   list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
		   list.add(centerY + radius * Math.sin(2 * i * Math.PI / 6));
	   }
	   
	   // Create a scene and place it in the stage
	   Scene scene = new Scene(pane, (WIDTH + 20), (HEIGHT + 20));
	   primaryStage.setTitle("ShowPolygon");  // Set the stage title
	   primaryStage.setScene(scene);  // Place the scene in the stage
	   primaryStage.show();  // Display the stage	   
	}
			
	// The main method is only needed for the IDE	
	public static void main(String[] args)
	{
		Application.launch (args);
	}  // end main

}  // end of ShowPolygon class
