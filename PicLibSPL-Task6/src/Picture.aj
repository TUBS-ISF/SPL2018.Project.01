import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public aspect Picture {
	
	private String PictureJ.picture;


	public String PictureJ.getPicture() {
		return picture;
	}

	public void PictureJ.setPicture(String picture) {
		this.picture = picture;
	}

	before(): execution(public void GuiJ.createColumnNames() ) {
		GuiJ.getInstance().colNames.add("Picture");
		GuiJ.getInstance().propNumber++;
		System.out.println("Picture added");
	}
	
	before(): execution(public void GuiJ.fillPicture()) {
	
		GuiJ.getInstance().o[GuiJ.getInstance().pictureCounter][GuiJ.getInstance().propCounter] = GuiJ.getInstance().tempPictures[GuiJ.getInstance().pictureCounter].getPicture();
		GuiJ.getInstance().propCounter++;
	}

	//Testdaten

	after(): execution (public void PicController.addData()) {
		
		
		PicController.getInstance().pic1.setPicture("Fehlt");
		PicController.getInstance().pic2.setPicture("Fehlt");
		PicController.getInstance().pic3.setPicture("Fehlt");
	}
	
	
	after(): execution (public void addPic.AddPicListener.actionPerformed(ActionEvent)) {
		//System.out.println("test");
		PictureJ newpic = new PictureJ();
		PicController.getInstance().addPicture(newpic);
		
		
	}
	
	after(): execution (public void deletePic.AddDeleteListener.actionPerformed(ActionEvent)) {
		//System.out.println("test");
		PictureJ newpic = new PictureJ();
		PicController.deletePicture(newpic);
		
		
	}
	
	
}
