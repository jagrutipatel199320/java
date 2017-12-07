package application;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

import javafx.event.ActionEvent;

public class MainController implements Initializable {
	final MyNumber mynub = new MyNumber();
	
	@FXML
	private Label lblstatus;
	
	@FXML
	private ProgressBar pb;
	
	@FXML
	private ProgressIndicator pi;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		mynub.setNumber(0);
		mynub.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				// TODO Auto-generated method stub
				lblstatus.setText(new Double(mynub.getNumber()).toString());
			}
		});
		
		pb.progressProperty().bind(mynub.numberProperty());
		pi.progressProperty().bind(mynub.numberProperty());

		
	}
	public void btnClick(ActionEvent event) {
		mynub.setNumber(mynub.getNumber() + 0.1);
	}
	public void btn2Click(ActionEvent event) {
		mynub.setNumber(mynub.getNumber() - 0.1);
	}

}
