package app.service;

import java.time.LocalDate;
import java.util.ArrayList;

import app.model.Device;

public interface DeviceRepo {

	 public void addDevice(String numberSerial, String Name );
	 public String displayDevice();
	 public ArrayList<Device> display();



}
