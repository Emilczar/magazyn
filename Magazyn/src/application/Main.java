package application;

import javafx.application.Application;
import javafx.stage.Stage;
import serviceImpl.DeviceImpl;
import serviceImpl.MenuXmlImpl;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}


		System.out.println("testy");

		MenuXmlImpl impl = new  MenuXmlImpl();
		//impl.getXml();\
		for (int j = 0; j < impl.list().size(); j++) {
			String test = (String)impl.list().get(j);
			System.out.println("lista "+ test);
		}






		/*DeviceImpl deviceImpl = new DeviceImpl();
		deviceImpl.addDevice("serial", "nazwa");
		deviceImpl.displayDevice();
		deviceImpl.addDevice("serial1", "nazwa1");
		deviceImpl.displayDevice();

		deviceImpl.addDevice("serial2", "nazwa2");
		deviceImpl.displayDevice();

		deviceImpl.addDevice("serial3", "nazwa3");
		deviceImpl.displayDevice();

		deviceImpl.addDevice("serial4", "nazwa4");
		deviceImpl.displayDevice();

		deviceImpl.addDevice("serial5", "nazwa5");
		deviceImpl.displayDevice();*/



	}

	public static void main(String[] args) {
		launch(args);
	}
}
