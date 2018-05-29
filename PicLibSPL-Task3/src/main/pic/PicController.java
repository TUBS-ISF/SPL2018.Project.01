package main.pic;

import main.pic.Pic;


import java.util.*;

public class PicController {
	
	public PicController() {
		Pic picture1 = new Pic("picture1");
		picture1.setName("0001");
		picture1.setPlace("gpskoord0001");
		picture1.setTime(1);
		picture1.setFormat("png");
		picture1.setResources("/Desert.jpg");
		this.addPic(picture1);
		
		Pic picture2 = new Pic("picture2");
		picture2.setName("0002");
		picture2.setPlace("gpskoord0002");
		picture2.setTime(2);
		picture2.setFormat("png");
		picture2.setResources("/Jellyfish.jpg");
		this.addPic(picture2);
		
	}
	
	private static PicController instance;
	static int picKey = 0;
	HashMap<Number, Pic> picCollection = new HashMap<Number, Pic>();
	
	public void addPic(Pic pic) {
		picKey++;
		pic.setPicKey(picKey);
		picCollection.put(picKey, pic);
	}

	public void removePic(int picKey) {
		picCollection.remove(picKey);
	}
	
	/* public void setPic(String name, Vector<String> data) {
		
		Pic pic = new Pic(name);
		
		if (PropertyManager.getProperty("Picture")) {
			pic.setFormat(data.get(0));
			data.remove(0);
		}
		
		if (PropertyManager.getProperty("Name")) {
			pic.setName(data.get(0));
			data.remove(0);
		}
		
		if (PropertyManager.getProperty("Place")) {
			pic.setPlace(data.get(0));
			data.remove(0);
		}
		
		if (PropertyManager.getProperty("Time")) {
			pic.setTime(Integer.valueOf(data.get(0)));
			data.remove(0);
		}
		
		if (PropertyManager.getProperty("Format")) {
			pic.setFormat(data.get(0));
			data.remove(0);
		}
		
		
		
		addPic(pic);
	} */
	
	public HashMap<Number, Pic> getPicCollection(){
		return picCollection;
	}

	public static PicController getInstance() {
		if (PicController.instance == null) {
			PicController.instance = new PicController ();
		}
		return PicController.instance;
	}

}
