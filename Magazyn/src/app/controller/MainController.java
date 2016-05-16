package app.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

	@FXML
	private StackPane mainStackPane;

	@FXML
	public void initialize() {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/view/MenuView.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
		mainStackPane.getChildren().add(pane);

	}

}
