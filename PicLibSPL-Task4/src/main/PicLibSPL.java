package main;

import ui.Gui;

import java.io.IOException;

import library.PicController;

public class PicLibSPL {

	public PicLibSPL() {
		
		PicController.getInstance();
		Gui gui = new Gui();
		Gui.instance = gui;
		
		/*
		CommandLine cli = new CommandLine(); 
		*/
	}
	
	
	public static void main(String args0[]) throws IOException{
		PicLibSPL application = new PicLibSPL(); 
	}
	
}
