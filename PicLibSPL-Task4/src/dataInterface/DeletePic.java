package dataInterface;

import library.PicController;
import library.Picture;

public class DeletePic{

	public static void deletePicture (Picture pic) {
		if (PicController.pictureKey >=1) {
		PicController.picCollection.remove(pic.getPictureKey());
		PicController.pictureKey--;
		
		}
		
		
		System.out.println(PicController.pictureKey);
	
	}
	
}
