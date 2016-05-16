package app.service;


import java.io.IOException;
import java.util.ArrayList;



public interface MenuXml {
	void getXml() throws IOException;

	//tworzenie menu dla combox
	public ArrayList<String> menuComBox();

}
