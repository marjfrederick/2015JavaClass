//  http://www.java2s.com/Tutorials/Java/JavaFX/0590__JavaFX_ComboBox.htm
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
//ww  w. ja v  a2 s.  c  o m
public class ComboBoxTest extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    Scene scene = new Scene(new Group(), 450, 250);

    ComboBox<String> myComboBox = new ComboBox<String>();
    myComboBox.getItems().addAll("A","B","C","D","E");
    myComboBox.setEditable(true);        
    
    Group root = (Group) scene.getRoot();
    root.getChildren().add(myComboBox);
    stage.setScene(scene);
    stage.show();

  }
}