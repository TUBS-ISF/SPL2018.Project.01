package main;

import java.io.IOException;
// hier fehlt noch was

//import main.cli.CommandLine;
import main.gui.GuiController;
import main.pic.PicController;
import properties.PropertyManager;



/* Main Method 
 * decision if GUI or CLI
 */
public class PicLibSPL {
	
	public PicLibSPL() {
		super();
		PicController.getInstance();
		if (PropertyManager.getProperty("GUI")) {
			GuiController gc = new GuiController();
		}
		/*
		if(PropertyManager.getProperty("CLI")){
			CommandLine cli = new CommandLine(); 
		}
		*/
	}
	
	public static void main(String args0[]) throws IOException{
		PicLibSPL application = new PicLibSPL();
	}

}




