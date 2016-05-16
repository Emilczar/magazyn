package app.service.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import app.model.Device;
import app.service.DeviceRepo;

public class DeviceRepoImpl implements DeviceRepo {
	String time;
	String name;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Device> getLista() {
		return lista;
	}

	ArrayList<Device> lista = new ArrayList<Device>();
	String tab[][] = new String[3][lista.size()];
	int index;

	@Override
	public void addDevice(String numberSerial, String Name) {
		Device device = new Device();
		LocalDate loDate = LocalDate.now();
		time = loDate.toString();
		device.setNumerSeryjny(numberSerial);
		device.setNazwaSprzetu(Name);
		device.setTime(time);
		index = lista.size();
		System.out.println("index: " + index);
		lista.add(device);

	}

	@Override
	public String displayDevice() {
		System.out.println("lista: " + lista.get(0).getNazwaSprzetu());
		String testy = lista.get(0).getNazwaSprzetu();
		return testy;

	}

	@Override
	public ArrayList<Device> display() {
		System.out.println("Lista: " + lista);
		return lista;
	}
}
