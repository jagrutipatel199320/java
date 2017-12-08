package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.event.ActionEvent;



public class MainController implements Initializable{
	@FXML private WebView webview;
	@FXML private WebEngine engin;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		engin = webview.getEngine();
		
	}
	public void btn1(ActionEvent event) {
		engin.load("https://www.google.com");
	}
	public void btn2(ActionEvent event) {
		engin.executeScript("window.location = \"https://www.youtube.com//\";");
	}
	public void btn3(ActionEvent event) {
		engin.loadContent("<html><body><h1>Hellow world</h1></body></html>");
	}
	public void btn4(ActionEvent event) {
		engin.reload();
	}
}
