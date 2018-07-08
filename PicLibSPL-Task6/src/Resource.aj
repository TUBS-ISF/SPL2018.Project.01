
public aspect Resource {
	private String PictureJ.resource;


	public String PictureJ.getResource() {
		return resource;
	}

	public void PictureJ.setResource(String resource) {
		this.resource = resource;
	}

	before(): execution(public void GuiJ.createColumnNames() ) {
		GuiJ.getInstance().colNames.add("Resource");
		GuiJ.getInstance().propNumber++;
		System.out.println("Resource added");
	}

	before(): execution(public void GuiJ.fillPicture()) {
	
		GuiJ.getInstance().o[GuiJ.getInstance().pictureCounter][GuiJ.getInstance().propCounter] = GuiJ.getInstance().tempPictures[GuiJ.getInstance().pictureCounter].getResource();
		GuiJ.getInstance().propCounter++;
	}

	//Testdaten

	after(): execution (public void PicController.addData()) {
		PicController.getInstance().pic1.setResource("/Desert.jpg");
		PicController.getInstance().pic2.setResource("/Jellyfish.jpg");
		PicController.getInstance().pic3.setResource("/Jellyfish.jpg");
	}
}
