
public aspect Place {
	
	private String PictureJ.place;


	public String PictureJ.getPlace() {
		return place;
	}

	public void PictureJ.setPlace(String place) {
		this.place = place;
	}

	before(): execution(public void GuiJ.createColumnNames() ) {
		GuiJ.getInstance().colNames.add("Place");
		GuiJ.getInstance().propNumber++;
		System.out.println("Place added");
	}

	before(): execution(public void GuiJ.fillPicture()) {
	
		GuiJ.getInstance().o[GuiJ.getInstance().pictureCounter][GuiJ.getInstance().propCounter] = GuiJ.getInstance().tempPictures[GuiJ.getInstance().pictureCounter].getPlace();
		GuiJ.getInstance().propCounter++;
	}

	//Testdaten

	after(): execution (public void PicController.addData()) {
		PicController.getInstance().pic1.setPlace("180N 157W");
		PicController.getInstance().pic2.setPlace("65N 165W");
		PicController.getInstance().pic3.setPlace("36N 205W");
	}
}
