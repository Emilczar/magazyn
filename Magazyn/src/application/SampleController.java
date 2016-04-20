package application;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import model.Device;
import model.MenuSprzet;
import model.Sprzet;
import serviceImpl.ButtonFunctionImpl;
import serviceImpl.DeviceRepoImpl;
import serviceImpl.MenuXmlImpl;

public class SampleController {

	public SampleController() {
		System.out.println("Controler");
	}

	@FXML
	private ComboBox<MenuSprzet> menuBox;

	@FXML
	private TableView<Sprzet> tabableView;

	@FXML
	private TableColumn<Sprzet, String> nsCol;

	@FXML
	private TableColumn<Sprzet, String> nazwaCol;
	@FXML
	private TableColumn<Sprzet, String> dataCol;

	@FXML
	private Button addButon;

	@FXML
	private TextField textField;
	@FXML
	private VBox vbox;

	@FXML
	void initialize() {

		/////////////////////////////////////////////////////////////////////////////////////////////
		/////////////// WYSWIETLANIE LISTY DO COMBOBOX
		/////////////////////////////////////////////////////////////////////////////////////////////

		MenuXmlImpl impl = new MenuXmlImpl();

		ObservableList<MenuSprzet> list = FXCollections.observableArrayList();
		menuBox.setItems(list);
		for (int j = 0; j < impl.menuComBox().size(); j++) {
			String test = (String) impl.menuComBox().get(j);
			list.add(new MenuSprzet(test));
		}
		menuBox.getSelectionModel().selectFirst();

		/////////////////////////////////////////////////////////////////////////////////////////////
		/////////////// FUNKCJE DODAWANIA DO TABLEVIEW
		/////////////////////////////////////////////////////////////////////////////////////////////
		ObservableList<Sprzet> deviceList = FXCollections.observableArrayList();
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("testy " + textField.getText() + " menu "
						+ menuBox.getSelectionModel().getSelectedItem() + "ilosc  " + textField.getLength());
				if (textField.getLength() == 0) {
					System.out.println("Ilosc textu jest 0");

					textField.clear();

				} else {

					System.out.println("Ilosc textu jest wieksza od 0");
					String numerSeryjny = textField.getText();
					String nazwaSp = menuBox.getSelectionModel().getSelectedItem().toString();
					DeviceRepoImpl deviceRepoImpl = new DeviceRepoImpl();
					LocalDate loDate = LocalDate.now();
					String time = loDate.toString();
					deviceList.add(new Sprzet(numerSeryjny, nazwaSp, time));
					nsCol.setCellValueFactory(cellData -> cellData.getValue().numberSerialProperty());
					nazwaCol.setCellValueFactory(cellData -> cellData.getValue().nazwaSprzetuProperty());
					dataCol.setCellValueFactory(cellData -> cellData.getValue().dataProperty());
					tabableView.setItems(deviceList);
					System.out.println("nazwa teksu nazw :" + nazwaSp);
					textField.clear();

				}

			}
		};

		addButon.addEventHandler(ActionEvent.ACTION, handler);

		///////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////////////////////////////////////////////////////////////////////////////

		/*
		 * EventHandler<MouseEvent> moEventHandler = e -> { System.out.println(
		 * "myszka z lambdy");
		 *
		 *
		 * };
		 */

		/*
		 * addButon.addEventHandler(MouseEvent.MOUSE_ENTERED, moEventHandler);
		 *
		 * /////////////////////////////////////////////////////////////////////
		 * //////////////////////// addButon.setOnAction(e -> {
		 * System.out.println("handler setON");
		 * addButon.removeEventHandler(MouseEvent.MOUSE_ENTERED,
		 * moEventHandler);
		 *
		 *
		 *
		 * });
		 */

		/////////////////////////////////////////////////////////////////////////////////////////////

	}
}
