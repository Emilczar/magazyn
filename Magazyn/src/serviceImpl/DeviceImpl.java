package serviceImpl;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Device;
import service.DeviceRepo;

public class DeviceImpl implements DeviceRepo {
	String time;
	List<Device> lista = new ArrayList<Device>();
	int index;
	Device device = new Device();
	@Override
	public void addDevice(String numberSerial, String Name) {

		LocalDate loDate = LocalDate.now();
		time = loDate.toString();
		device.setNumerSeryjny(numberSerial);
		device.setNazwaSprzetu(Name);
		device.setTime(time);
		index = lista.size();
		System.out.println("index: "+ index);
		lista.add(index, device);


	}

	@Override
	public void displayDevice() {
		System.out.println("testy wyswietlnie listy");

		System.out.println("ostatni index: " + index);
		for(int i=0; i<index; i++){
			System.out.println("lista: "+ lista.get(0));
		}
	}
}
