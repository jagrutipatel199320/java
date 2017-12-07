package application;

import javafx.event.ActionEvent;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label mymsg;
	public void generateRandom(ActionEvent event) {
		Random rand = new Random();
		int myrand = rand.nextInt(50) + 1;
		mymsg.setText(Integer.toString(myrand));
		System.out.println(Integer.toString(myrand));
		
	}
}
