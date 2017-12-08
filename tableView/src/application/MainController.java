package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class MainController implements Initializable{

	@FXML private TableView<Student> table;
	@FXML private TableColumn<Student,Integer> id;
	@FXML private TableColumn<Student,String> name;
	@FXML private TableColumn<Student,String> surname;
	@FXML private TableColumn<Student,Integer> age;
	
	public ObservableList<Student> list = FXCollections.observableArrayList(
			new Student(1,"jagruti","bhudiya",23),
			new Student(2,"uttam","solanki",24),
			new Student(3,"nisa","bhudiya",25),
			new Student(4,"teena","patel",26),
			new Student(5,"gautam","siyani",27)


			);
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Student,String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age"));

		table.setItems(list);
		
	}

}
