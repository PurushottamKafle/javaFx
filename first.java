package pksoftFX;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class first extends Application {
	 Button btn;
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	/**
	 * @author PurushottamKafle
	 */
	public void start(Stage primaryStage) throws Exception{
		 btn = new Button("Click me");
		 // here action happen
		 btn.setOnAction(
				 new EventHandler<ActionEvent>() {
					 public void handle(ActionEvent e) {
						 System.out.printf("%s", "This is anonymious class"); 
					 }
				 }
				 );
		 
		StackPane root = new StackPane();

		root.getChildren().add(btn);
		Scene sce = new Scene(root, 350,200);
		primaryStage.setScene(sce);
		primaryStage.show();
	}
}
