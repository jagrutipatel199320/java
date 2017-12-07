package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;

import java.util.List;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.FileChooser;



public class MainController {
	@FXML
	private Button btn1;
	
	@FXML
	private Button btn2;
	
	@FXML
	private ListView listview;
	
	public void button1Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\Users\\admin\\Downloads"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("pdf file","*pdf"));

		File selectFile = fc.showOpenDialog(null);
		
		if(selectFile != null) {
			listview.getItems().add(selectFile.getName());
		}else {
			System.out.println("file is not valid");
		}
	}
	
	public void button2Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\Users\\admin\\Downloads"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("pdf file","*pdf"));

		List<File> selectFile = fc.showOpenMultipleDialog(null);
		
		if(selectFile != null) {
			for(int i = 0;i <selectFile.size(); i++) {
				listview.getItems().add(selectFile.get(i).getName());

			}
		}else {
			System.out.println("file is not valid");
		}

	}

}
