package application;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.event.ActionEvent;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;



public class MainController {
	@FXML PieChart piechart;
	@FXML Label status;
	
	public void btn1(ActionEvent event) {
		ObservableList<Data> list = FXCollections.observableArrayList(
				new PieChart.Data("java", 50),
				new PieChart.Data("c++", 10),
				new PieChart.Data("python", 20),
				new PieChart.Data("c", 20)				
				);
		
		piechart.setData(list);
	}
}
