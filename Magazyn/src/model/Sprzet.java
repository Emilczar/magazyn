package model;

import javafx.beans.property.StringProperty;

public class Sprzet {

	private final StringProperty numberSerial;
	private final StringProperty nazwaSprzetu;
	private final StringProperty czas;


	public Sprzet(){
		this(null, null, null);

	}

	public Sprzet(StringProperty numberSerial, StringProperty nazwaSprzetu, StringProperty czas) {

		this.numberSerial = numberSerial;
		this.nazwaSprzetu = nazwaSprzetu;
		this.czas = czas;
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

	public final StringProperty dataProperty() {
		return this.czas;
	}

	public final String getData() {
		return this.dataProperty().get();
	}

	public final void setData(final String czas) {
		this.dataProperty().set(czas);
	}


}
