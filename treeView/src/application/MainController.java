package application;

import javafx.fxml.FXML;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.TreeView;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;

import javafx.scene.image.Image;


public class MainController implements Initializable {
	
	@FXML 
	 TreeView <String> treeview;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/icon.png"));
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		TreeItem<String> root = new TreeItem<>("Root",new ImageView(icon));
		root.setExpanded(true);

		TreeItem<String> nodeA = new TreeItem<>("node A",new ImageView(icon));
		TreeItem<String> nodeB = new TreeItem<>("node B",new ImageView(icon));
		TreeItem<String> nodeC = new TreeItem<>("node C",new ImageView(icon));
		
		root.getChildren().addAll(nodeA,nodeB,nodeC);
		
		TreeItem<String> nodeA1 = new TreeItem<>("node A1",new ImageView(icon));
		TreeItem<String> nodeB1 = new TreeItem<>("node B1",new ImageView(icon));
		TreeItem<String> nodeC1 = new TreeItem<>("node C1",new ImageView(icon));
		
		nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);
		nodeB.getChildren().addAll(nodeA1,nodeB1,nodeC1);
		nodeC.getChildren().addAll(nodeA1,nodeB1,nodeC1);		
		
		treeview.setRoot(root);
	}
	public void mouseClick(MouseEvent mouseEvent) {
		if(mouseEvent.getClickCount() == 2) {
	TreeItem<String> item = treeview.getSelectionModel().getSelectedItem();
	System.out.println(item.getValue());
		}
	}
}
