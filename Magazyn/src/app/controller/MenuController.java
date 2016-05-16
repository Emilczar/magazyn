package app.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.layout.Pane;

public class MenuController {

	private MainController mainController;

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}



	@FXML
	public void addDevice() {

		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/app/view/AddDeviceView.fxml"));
		Pane pane;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	public void outPutDevice() {

	}

	@FXML
	public void searchDevice() {

	}

}
