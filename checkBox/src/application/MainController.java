package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;


public class MainController {

	@FXML
	 Label lblcount;
	
	@FXML
	 Label lbllist;
	
	@FXML
	 CheckBox cb1;
	
	@FXML
	 CheckBox cb2;
	
	@FXML
	 CheckBox cb3;
	
	@FXML
	 CheckBox cb4;
	
	public void checkEvent(ActionEvent event) {
		int count = 0;
		String msg = "";
		if(cb1.isSelected()) {
			count ++;
			msg += cb1.getText() + "\n";
		}
		if(cb2.isSelected()) {
			count ++;
			msg += cb2.getText() + "\n";
		}
		if(cb3.isSelected()) {
			count ++;
			msg += cb3.getText() + "\n";
		}
		if(cb4.isSelected()) {
			count ++;
			msg += cb4.getText() + "\n";
		}
		lblcount.setText("Item selected: " + count );
		lbllist.setText(msg);
		
	}
}
