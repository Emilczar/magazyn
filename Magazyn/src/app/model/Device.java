package app.model;

public class Device {

	private String numerSeryjny;
	private String nazwaSprzetu;
	private String time;

	public Device() {

	}

	public Device(String numerSeryjny, String nazwaSprzetu, String time) {

		this.numerSeryjny = numerSeryjny;
		this.nazwaSprzetu = nazwaSprzetu;
		this.time = time;
	}

	public String getNumerSeryjny() {
		return numerSeryjny;
	}

	public void setNumerSeryjny(String numerSeryjny) {
		this.numerSeryjny = numerSeryjny;
	}

	public String getNazwaSprzetu() {
		return nazwaSprzetu;
	}

	public void setNazwaSprzetu(String nazwaSprzetu) {
		this.nazwaSprzetu = nazwaSprzetu;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
