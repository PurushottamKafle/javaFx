package pksoftFX;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class switching to next scene extends Application { // inherits from Application
Stage window;
Scene scene1, scene2;

public static void main(String[] args) {
	launch(args);
   }
public void start(Stage primaryStage) throws Exception{
window = primaryStage;

window.setTitle("This is main title");
Label lb1 = new Label("");
lb1.setText("Welcome, to scene 1. If You want to go in scene 2 then click below button");
Button btn1 = new Button();
btn1.setText("Go to Scene2");
/**
 * For event handleing we are using labda expressions or Event Handeler
 * 
 */
btn1.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		window.setScene(scene2);
	}
}
		);
	// now using VBox layout for confortable responsive window or stage and scne
VBox layout1 = new VBox(30); // VBox layout uses the parameter for making Space
layout1.getChildren().addAll(btn1, lb1);
/**
 * SETUP OF SCENE
 */
scene1 = new Scene(layout1, 500,500); // main 
/**
 * For next scene
 */
Button btn2 = new Button();
btn2.setText("Go Bact - Scene1");
btn2.setOnAction(new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		window.setScene(scene1);
	}
});
StackPane layout2 = new StackPane();
layout2.getChildren().add(btn2);
/**
 * SETUPO SCENE2
 */
scene2 = new Scene(layout2, 500, 500);
// Making default and showing all
window.setScene(scene1); // this act as a default
window.show(); // for showing window or Stage

}

}
