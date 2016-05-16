package app.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sprzet {

	private final StringProperty numberSerial;
	private final StringProperty nazwaSprzetu;
	private final StringProperty czas;




	public Sprzet(String numerSeryjny, String nazwaSp, String time) {

		this.numberSerial = new SimpleStringProperty(numerSeryjny);
		this.nazwaSprzetu = new SimpleStringProperty(nazwaSp);
		this.czas = new SimpleStringProperty(time);
	}

	public final StringProperty numberSerialProperty() {
		return this.numberSerial;
	}

	public final String getNumberSerial() {
		return this.numberSerialProperty().get();
	}

	public final void setNumberSerial(final String numberSerial) {
		this.numberSerialProperty().set(numberSerial);
	}

	public final StringProperty nazwaSprzetuProperty() {
		return this.nazwaSprzetu;
	}

	public final String getNazwaSprzetu() {
		return this.nazwaSprzetuProperty().get();
	}

	public final void setNazwaSprzetu(final String nazwaSprzetu) {
		this.nazwaSprzetuProperty().set(nazwaSprzetu);
	}

	public final StringProperty czasProperty() {
		return this.czas;
	}

	public final String getCzas() {
		return this.czasProperty().get();
	}

	public final void setCzas(final String czas) {
		this.czasProperty().set(czas);
	}


}
