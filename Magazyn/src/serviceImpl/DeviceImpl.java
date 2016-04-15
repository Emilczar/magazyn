package serviceImpl;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Device;
import service.DeviceRepo;

public class DeviceImpl implements DeviceRepo {
	String time;

	ArrayList<Device> lista = new ArrayList<Device>();
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
		System.out.println("index: "+ index);
		lista.add(device);



	}

	@Override
	public void displayDevice() {
		System.out.println("testy wyswietlnie listy");

		System.out.println("ostatni index: " + index);
		for(int i=0; i<index; i++){
			System.out.println("lista: "+ lista.get(i).getNazwaSprzetu());
			System.out.println("lista nr "+i);
		}


		System.out.println("lista nr "+ lista);
	}
}
