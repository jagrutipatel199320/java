package application;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class MainController {
	@FXML
	private RadioButton rb1;
	
	@FXML
	private RadioButton rb2;
	
	@FXML
	private Label lbl;
	
	public void radioChecked(ActionEvent event) {
		
		String msg = "";
		
		if(rb1.isSelected()) {
			msg += rb1.getText()+"\n";
		}
		if(rb2.isSelected()) {
			msg += rb1.getText() +"\n";
		}
		System.out.println(msg);
		lbl.setText(msg);
	}
}















