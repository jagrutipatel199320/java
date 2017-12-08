package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.DatePicker;
import javafx.event.ActionEvent;
import java.time.LocalDate;

public class MainController {
	@FXML
	private DatePicker dp;
	
	@FXML
	private Label lbl;
	
	public void showDate(ActionEvent event) {
		LocalDate ld = dp.getValue();
		lbl.setText(ld.toString());
		System.out.println(ld.toString());
	}
}
