import java.io.IOException;






public class PicLibSPL {

	public PicLibSPL() {
		
		PicController.getInstance();
		
		
		GuiJ gui = new GuiJ();
		//Gui.instance = gui;
		
		/*
		CommandLine cli = new CommandLine(); 
		*/
	}
	
	
	public static void main(String args0[]) throws IOException{
		PicLibSPL application = new PicLibSPL(); 
	}
	
}
