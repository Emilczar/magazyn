package model;

public class MenuSprzet {
	@Override
	public String toString() {
		return name;
	}

	private String name;

	public MenuSprzet(String name){
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}
