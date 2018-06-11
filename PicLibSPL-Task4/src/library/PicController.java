package library;

import java.util.HashMap;

import library.Picture;
import library.Sort;
import dataInterface.InportPic;


public class PicController {
	
	
	public PicController(){
		
		Picture picture1 = new Picture();
		picture1.setProperty("Name", "001");
		picture1.setProperty("Place", "gpskoord0001");
		picture1.setProperty("Time", "1");
		picture1.setProperty("Format", "png");
		picture1.setProperty("Resource", "/Desert.jpg");
		
		InportPic.addPicture(picture1);
	
	}

	private static PicController instance;
	public static int pictureKey = 0;
	public static HashMap<Number, Picture> picCollection = new HashMap<Number, Picture>();
	//vll seter machen
	
	
	public HashMap<Number, Picture> getPicCollection() {
		return picCollection;
	}

	public static PicController getInstance () {

	    if (PicController.instance == null) {

	    	PicController.instance = new PicController ();
	    }
	    return PicController.instance;
	  }
	
	
	
}
