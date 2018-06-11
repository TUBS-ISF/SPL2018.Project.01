package ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dataInterface.InportPic;
import dataInterface.DeletePic;
import library.PicController;
import library.Picture;
import ui.Gui;

public class ButtonListener implements ActionListener {
	
	String buttonName;
	
	public ButtonListener(String name){
		
		buttonName = name;
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (buttonName == "addPic" ) {
			
			InportPic.addPicture(newpic()); //TODO fertig machen
			Gui.instance.display();
		}
		
		if (buttonName == "deletePic" ) {
			
			Picture pic = PicController.picCollection.get(PicController.pictureKey);
			DeletePic.deletePicture(pic); //TODO fertig machen
		}
		
	}
	
	public Picture newpic(){
		
		Picture pic = new Picture();
		pic.setProperty("Name", "001");
		pic.setProperty("Place", "gpskoord0001");
		pic.setProperty("Time", "1");
		pic.setProperty("Format", "png");
		pic.setProperty("Resource", "/Desert.jpg");	
		
		return pic;
		
	}
	
}
