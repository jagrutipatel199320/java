package lambdaExpression;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Helloworld extends Application{

	public static void main(String[] args) {
		launch(args); 
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Click me");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> {
			System.exit(0);
			System.out.println("exit");
		} );
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("hello world");
				
			}
		}); 
		VBox root = new VBox();
		root.getChildren().addAll(btn,exit );
		Scene scene = new Scene(root,500,300 );
		primaryStage.setTitle("My Title");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
 