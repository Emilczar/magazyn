package app.model;

public class MenuSprzet {


	private String name;

	@Override
	public String toString() {
		return name;
	}



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
