
import java.util.*; 


public  class  PicController {
	
	
	
	public PicController(){
		
		Picture picture1 = new Picture();
		picture1.setName("001");
		picture1.setPlace("gpskoord0001");
		picture1.setTime("1");
		picture1.setFormat("png");
		picture1.setResource("/Desert.jpg");
		
		this.addPicture(picture1);
	
	}

	

	private static PicController instance;

	
	public static int pictureKey = 0;

	
	public static HashMap<Number, Picture> picCollection = new HashMap<Number, Picture>();

	
	//vll seter machen
	
	
	public void addPicture (Picture pic) {
		
		pictureKey++;
		picCollection.put(PicController.pictureKey, pic);
		
		
		System.out.println(PicController.pictureKey);
	
	
	}

	
	
	public static void deletePicture (Picture pic) {
		if (pictureKey >=1) {
		picCollection.remove(pic.getPictureKey());
		pictureKey--;
		
		}
		
		
		System.out.println(PicController.pictureKey);
	
	}

	
	
	
	
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
