package main.pic;



public class Pic {
	
	String name;
	String place;
	int time;
	String format;
	String resource;
	
	int picKey;
	

	public Pic(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String getFormat() {
		return format;
	}
	
	public void setPicKey(int picKey) {
		this.picKey = picKey;
	}
	
	public int getPicKey() {
		return picKey;
	}
	
	//getClass().getResource("/Desert.jpg")).getImage();
	
	public void setResources(String resource) {
		this.resource = resource;
	}
	
	public String getResources() {
		return resource;
	}
	
}
