package service;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Device;

public interface DeviceRepo {

	 public void addDevice(String numberSerial, String Name );
	 public String displayDevice();
	 public ArrayList<Device> display();



}
