package javaFXDemo;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application{

	public static void main(String[] args) {
		launch(args); 
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Click me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("hello world");
				
			}
		}); 
		StackPane root = new StackPane();
		root.getChildren().addAll(btn);
		Scene scene = new Scene(root,500,300 );
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
 