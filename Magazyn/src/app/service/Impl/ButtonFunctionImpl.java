package app.service.Impl;


import app.service.ButtonFunction;

public class ButtonFunctionImpl implements ButtonFunction {


	DeviceRepoImpl deviceRepo = new DeviceRepoImpl();
	@Override
	public void addWarehous(String numberSerial, String Name) {
		deviceRepo.addDevice(numberSerial, Name);
		deviceRepo.displayDevice();


	}


}
