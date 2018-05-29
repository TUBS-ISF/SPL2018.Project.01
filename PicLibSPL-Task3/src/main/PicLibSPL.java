package main;

import java.io.IOException;
// hier fehlt noch was

//import main.cli.CommandLine;
import main.gui.GuiController;
import main.pic.PicController;



/* Main Method 
 * decision if GUI or CLI
 */
public class PicLibSPL {
	
	public PicLibSPL() {
		//super();
		
		//#ifdef GUI
		PicController.getInstance();
			GuiController gc = new GuiController();
		//#endif
			
		/*
		
			CommandLine cli = new CommandLine(); 

		*/
	}
	
	public static void main(String args0[]) throws IOException{
		PicLibSPL application = new PicLibSPL();
	}

}
