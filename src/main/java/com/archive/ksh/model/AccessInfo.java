package com.archive.ksh.model;

public class AccessInfo {
	
	private String AccessId;
	private String ipAdress;
	private String location;
	private String device;
	public String getAccessId() {
		return AccessId;
	}
	public void setAccessId(String accessId) {
		AccessId = accessId;
	}
	public String getIpAdress() {
		return ipAdress;
	}
	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	
	
}
