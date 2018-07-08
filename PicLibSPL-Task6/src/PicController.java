


import java.util.*;



public class PicController {
	
	private static PicController instance;
	
	PictureJ pic1 = new PictureJ();
	PictureJ pic2 = new PictureJ();
	PictureJ pic3 = new PictureJ();
	
	public PicController(){
		
		instance = this;
		
		this.addData();
		
		this.addPicture(pic1);
		this.addPicture(pic2);
		this.addPicture(pic3);
		
		System.out.println("Bild: 1 " +pic1.getName());
	
	}


	
	



	public static int pictureKey = 0;
	public static HashMap<Number, PictureJ> picCollection = new HashMap<Number, PictureJ>();
	//vll seter machen
	
	public void addPicture (PictureJ pic) {
		
		pictureKey++;
		pic.setPictureKey(pictureKey);
		picCollection.put(pictureKey, pic);
		
		System.out.println(PicController.pictureKey);
	
	}
	
	public static void deletePicture (PictureJ pic) {
		if (pictureKey >=1) {
		picCollection.remove(pic.getPictureKey());
		pictureKey--;
		
		}
		
		
		System.out.println(PicController.pictureKey);
	
	}
	
	
	public void addData() {
		//Point for Aspects to fill the test objects
		System.out.println("addData");
	}
	
	
	
	
	public HashMap<Number, PictureJ> getPicCollection() {
		return picCollection;
	}

	public static PicController getInstance () {

	    if (PicController.instance == null) {

	    	PicController.instance = new PicController();
	    }
	    return PicController.instance;
	  }
	
	
	
}
