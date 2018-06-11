package dataInterface;

import library.PicController;
import library.Picture;

public class InportPic{

	public static void addPicture (Picture pic) {
		
		PicController.pictureKey++;
		PicController.picCollection.put(PicController.pictureKey, pic);
		
		
		System.out.println(PicController.pictureKey);
	
	
	}
	
	
}
