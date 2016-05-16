package app.service.Impl;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import app.service.MenuXml;

import org.w3c.dom.Element;

public class MenuXmlImpl implements MenuXml {

	int index;

	private static final String FILENAME = "src\\date\\combox.xml";

	@Override
	public void getXml() {
		System.out.println("TEST XML :");
		try {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(FILENAME);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList list = doc.getElementsByTagName("menu");
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) node;
					String test = (String) e.getAttribute("name");
					System.out.println("Element Menu : " + e.getAttribute("name"));
					System.out.println("Element test: " + test);
				}
			}
		} catch (Exception e) {
			System.out.println("PROBLEM XMl :");
			e.printStackTrace();
		}

	}


	@Override
	public ArrayList<String> menuComBox() {
		ArrayList<String> lista = new ArrayList<String>();

		try {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(FILENAME);
			doc.getDocumentElement().normalize();

			NodeList list = doc.getElementsByTagName("menu");
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) node;

					String test = (String) e.getAttribute("name");
					index = lista.size();
					lista.add(index, test);
				}
			}
		} catch (Exception e) {
			System.out.println("PROBLEM XMl :");
			e.printStackTrace();
		}

		return lista;
	}

}
