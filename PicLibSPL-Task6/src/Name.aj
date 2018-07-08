
public aspect Name {

	declare precedence: Picture, Name, Place, Time, Format, Resource;
	
	private String PictureJ.name;


	public String PictureJ.getName() {
		return name;
	}

	public void PictureJ.setName(String name) {
		this.name = name;
	}

	before(): execution(public void GuiJ.createColumnNames() ) {
		GuiJ.getInstance().colNames.add("Name");
		GuiJ.getInstance().propNumber++;
		System.out.println("Name added");
	}

	before(): execution(public void GuiJ.fillPicture()) {
	
		GuiJ.getInstance().o[GuiJ.getInstance().pictureCounter][GuiJ.getInstance().propCounter] = GuiJ.getInstance().tempPictures[GuiJ.getInstance().pictureCounter].getName();
		GuiJ.getInstance().propCounter++;
	}

	//Testdaten

	after(): execution (public void PicController.addData()) {
		PicController.getInstance().pic1.setName("01");
		PicController.getInstance().pic2.setName("02");
		PicController.getInstance().pic3.setName("03");
	}
	
	
}
