
public aspect Time {

	private String PictureJ.time;


	public String PictureJ.getTime() {
		return time;
	}

	public void PictureJ.setTime(String time) {
		this.time = time;
	}

	before(): execution(public void GuiJ.createColumnNames() ) {
		GuiJ.getInstance().colNames.add("Time");
		GuiJ.getInstance().propNumber++;
		System.out.println("Time added");
	}

	before(): execution(public void GuiJ.fillPicture()) {
	
		GuiJ.getInstance().o[GuiJ.getInstance().pictureCounter][GuiJ.getInstance().propCounter] = GuiJ.getInstance().tempPictures[GuiJ.getInstance().pictureCounter].getTime();
		GuiJ.getInstance().propCounter++;
	}

	//Testdaten

	after(): execution (public void PicController.addData()) {
		PicController.getInstance().pic1.setTime("15h");
		PicController.getInstance().pic2.setTime("2h");
		PicController.getInstance().pic3.setTime("20h");
	}
}
