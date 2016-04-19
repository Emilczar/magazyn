package application;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.MenuSprzet;
import serviceImpl.MenuXmlImpl;

public class SampleController {

	public SampleController() {
		System.out.println("Controler");
	}

	@FXML
	private ComboBox<MenuSprzet> menuBox;

	@FXML

	private TableView tabableView;

	@FXML
	private Button addButon;

	@FXML
	private TextField textField;
	@FXML
	private VBox vbox;


	@FXML
	private void onTextF (){

	}
	@FXML
	private void testClik(){



			if (textField.getLength()==0) {
				addButon.setDisable(true);
			}
			 else {
				 addButon.setDisable(false);

			}



	}

	@FXML
	void initialize() {

		MenuXmlImpl impl = new MenuXmlImpl();
		ObservableList<MenuSprzet> list = FXCollections.observableArrayList();
		menuBox.setItems(list);
		for (int j = 0; j < impl.menuComBox().size(); j++) {
			String test = (String) impl.menuComBox().get(j);
			list.add(new MenuSprzet(test));
		}
		menuBox.getSelectionModel().selectFirst();

		/////////////////////////////////////////////////////////////////////////////////////////////
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("testy " + textField.getText()+" menu "+ menuBox.getSelectionModel().getSelectedItem() +"ilosc  " +textField.getLength());




			}
		};
		addButon.addEventHandler(ActionEvent.ACTION, handler);

		/////////////////////////////////////////////////////////////////////////////////////////////

		/*
		EventHandler<MouseEvent> moEventHandler = e -> {
			System.out.println("myszka z lambdy");


		};*/

		/*
		addButon.addEventHandler(MouseEvent.MOUSE_ENTERED, moEventHandler);

		/////////////////////////////////////////////////////////////////////////////////////////////
		addButon.setOnAction(e -> {
			System.out.println("handler setON");
			addButon.removeEventHandler(MouseEvent.MOUSE_ENTERED, moEventHandler);



		});
		*/

		/////////////////////////////////////////////////////////////////////////////////////////////

	}
}
