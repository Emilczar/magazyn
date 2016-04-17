package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import model.MenuSprzet;
import serviceImpl.MenuXmlImpl;

public class SampleController {

	public SampleController() {
		System.out.println("Controler");
	}

	@FXML
	private ComboBox<MenuSprzet> menuBox;
	@FXML
	void initialize(){

		MenuXmlImpl impl = new  MenuXmlImpl();
		ObservableList<MenuSprzet> list = FXCollections.observableArrayList();

		for (int j = 0; j < impl.menuComBox().size(); j++) {
			String test = (String)impl.menuComBox().get(j);
			list.add(new MenuSprzet(test));

		}

		menuBox.setItems(list);







	}
}
