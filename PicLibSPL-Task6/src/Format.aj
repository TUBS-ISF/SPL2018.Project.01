
public aspect Format {

	private String PictureJ.format;
	
	public String PictureJ.getFormat() {
		return format;
	}
	
	public void PictureJ.setFormat(String format) {
		this.format = format;
	}
	
	before(): execution(public void GuiJ.createColumnNames() ) {
		GuiJ.getInstance().colNames.add("Format");
		GuiJ.getInstance().propNumber++;
		System.out.println("Format added");
	}
	
	before(): execution(public void GuiJ.fillPicture()) {
		
		GuiJ.getInstance().o[GuiJ.getInstance().pictureCounter][GuiJ.getInstance().propCounter] = GuiJ.getInstance().tempPictures[GuiJ.getInstance().pictureCounter].getFormat();
		GuiJ.getInstance().propCounter++;
	}
	
	//Testdaten
	
	after(): execution (public void PicController.addData()) {
		PicController.getInstance().pic1.setFormat("JPG");
		PicController.getInstance().pic2.setFormat("PNG");
		PicController.getInstance().pic3.setFormat("BMP");
	}
	
}
