package application;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.event.ActionEvent;


public class MainController {
	@FXML LineChart<String,Number> linechart;
	
	public void btn(ActionEvent event) {
		linechart.getData().clear();
		XYChart.Series<String,Number> series =  new XYChart.Series<String,Number>();
		series.getData().add(new XYChart.Data<String,Number>("Jan",200));
		series.getData().add(new XYChart.Data<String,Number>("feb",500));
		series.getData().add(new XYChart.Data<String,Number>("march",300));
		series.getData().add(new XYChart.Data<String,Number>("april",600));
		series.getData().add(new XYChart.Data<String,Number>("may",100));
		series.setName("Month pay 1");

		XYChart.Series<String,Number> series1 =  new XYChart.Series<String,Number>();
		series1.getData().add(new XYChart.Data<String,Number>("Jan",400));
		series1.getData().add(new XYChart.Data<String,Number>("feb",800));
		series1.getData().add(new XYChart.Data<String,Number>("march",100));
		series1.getData().add(new XYChart.Data<String,Number>("april",900));
		series1.getData().add(new XYChart.Data<String,Number>("may",100));
		series1.setName("Month pay 2");
		linechart.getData().addAll(series,series1);
	}
}
