import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
public class MyJavaFXApplication extends Application {
 public static void main(String[] args) {
 launch(args);
 }
 @Override
 public void start(Stage primaryStage) {
 Group root = new Group();
 Scene scene = new Scene(root, 300, 250);
 
 Rectangle r = new Rectangle(50, 50, 80, 30); 
 Rectangle r1 = new Rectangle(130, 50, 5, 30); 
 Rectangle r2 = new Rectangle(135, 50, 80, 30); 
 root.getChildren().add(r); 
 root.getChildren().add(r1); 
 root.getChildren().add(r2); 

 Rectangle r3 = new Rectangle(50, 80, 165, 5); //
 root.getChildren().add(r3);

 Rectangle r4 = new Rectangle(50, 85, 40, 30); 
 root.getChildren().add(r4);
 Rectangle r5 = new Rectangle(90, 85, 5, 30); 
 root.getChildren().add(r5);
 Rectangle r6 = new Rectangle(95, 85, 75, 30); 
 root.getChildren().add(r6);
 Rectangle r7 = new Rectangle(170, 85, 5, 30); 
 root.getChildren().add(r7);
 Rectangle r8 = new Rectangle(175, 85, 40, 30); 
 root.getChildren().add(r8);

 Rectangle r9 = new Rectangle(50, 110, 165, 5);
 root.getChildren().add(r9);

 Rectangle r10 = new Rectangle(50, 115, 80, 30); 
 root.getChildren().add(r10); 
 Rectangle r11 = new Rectangle(130, 115, 5, 30); 
 root.getChildren().add(r11); 
 Rectangle r12 = new Rectangle(135, 115, 80, 30); 
 root.getChildren().add(r12); 

 r.setFill(Color.BROWN); 
 r1.setFill(Color.YELLOW); 
 r2.setFill(Color.BROWN); 
 r3.setFill(Color.YELLOW);
 r4.setFill(Color.BROWN);
 r5.setFill(Color.YELLOW);
 r6.setFill(Color.BROWN);
 r7.setFill(Color.YELLOW);
 r8.setFill(Color.BROWN);
 r9.setFill(Color.YELLOW);
 r10.setFill(Color.BROWN);
 r11.setFill(Color.YELLOW);
 r12.setFill(Color.BROWN);
 scene.setFill(Color.rgb(105, 105, 13));

 primaryStage.setScene(scene);
 primaryStage.show();
 }
}