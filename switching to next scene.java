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

public class first extends Application { // inherits from Application
	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) { // main method
		
		launch(args); // this will call below start method
	}
	
	
	public void start(Stage primaryStage) throws Exception{ // this is main brain of javafx program
		window = primaryStage;
		window.setTitle("This is title");
		Label label = new Label("this is the label of scene 1");
		Button btn1 = new Button("Go to Scene2");
		btn1.setOnAction(e->
		{
			window.setScene(scene2); // going to scene 2
		}
		//layout1				
				);
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label, btn1);
		scene1 = new Scene(layout, 300, 200);
		/**
		 * FINISHING OF 1ST SCENE
		 * NO in Second Scene
		 * 
		 * 
		 */

		Button btn2 = new Button("This sucks, Goback in Scene1");
		btn2.setOnAction( e-> window.setScene(scene1)); // going to scene  bck to 1
		// layout
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(btn2);
		// making scene2
		scene2 = new Scene(layout2, 400, 500); // adding things inside the scene
		
		// Now Importantly Setuping default 
		window.setScene(scene1);
		window.show();
		
		
	}

}
