package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import interfaces.IProperty;
import interfaces.IButton;

import loader.PluginLoader;
import ui.ButtonListener;
import library.Picture;
import library.PicController;
 

public class Gui extends JFrame {

private static final long serialVersionUID = 1L;
	
	int columnCount = 0;
	JTable table = null;
	Vector<String> propNames = new Vector<String>();
	private final HashMap<String, IButton> iButtonHashMap = new HashMap<String,IButton>();
	private final HashMap<String, JButton> buttons = new HashMap<String,JButton>();
	public static Gui instance;
	
	
	public Gui() {
		
		setLayout(new BorderLayout());
		
		display();
				
		initIButtonHashMap();
		placeButton();
		this.setSize(new Dimension(750, 750));
		
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JScrollPane(table));
			
	}
	
	
	public String[] fillColumnNames() {
		
		HashMap<String, IProperty> picPropMap = new HashMap<String,IProperty >();
		
		List<IProperty> propertyPlugins = PluginLoader.load(IProperty.class);
		
		
		for(IProperty prop : propertyPlugins){
			String key = prop.getClass().getName(); 
			picPropMap.put(key, prop); 
		}
		
		String[] columnNames = new String[picPropMap.size()];
		
		if(picPropMap.containsKey("Picture")) propNames.add("Picture");
		if(picPropMap.containsKey("Name")) propNames.add("Name");		
		
		if(picPropMap.containsKey("Place")) propNames.add("Place");		
		if(picPropMap.containsKey("Time")) propNames.add("Time");		
		if(picPropMap.containsKey("Format")) propNames.add("Format");
		if(picPropMap.containsKey("Resource")) propNames.add("Resource");
			
		
		
		for(int i=0; i< propNames.size(); i++) {
			columnNames[i] = propNames.get(i);
		}	
		
		columnCount = columnNames.length;
		
		return columnNames;
		
	}
	
	
	
	public Object[][] fillTable() {
		
		HashMap<Number, Picture> pictureCollection= PicController.getInstance().getPicCollection();
		
		
		List<IProperty> propertyPlugins = PluginLoader.load(IProperty.class);
		
		
		HashMap<String, IProperty> picPropMap = new HashMap<String,IProperty >();
		
		
		
		for(IProperty prop : propertyPlugins){
			String key = prop.getClass().getName();
			picPropMap.put(key, prop); 
		}
		
		
		columnCount = picPropMap.size();
		
		Object[][] pictureCollectionMatrix = new Object[pictureCollection.size()][columnCount];
		
		
		int pictureCounter =0;
		for(Number n: pictureCollection.keySet()) {	
			
			int propCounter = 0;
            for(String key : pictureCollection.get(n).getPropertytMap().keySet()) {
            		
            		IProperty prop = pictureCollection.get(n).getPropertytMap().get(key);
            		pictureCollectionMatrix[pictureCounter][(columnCount-1)-propCounter] = prop.getValue();
            		propCounter++;
            		
            	}
			
            pictureCounter++;
            
		}
		
		
		return pictureCollectionMatrix;
		
	}
	
	
	private void initIButtonHashMap() {
		
		List<IButton> buttonPlugins = PluginLoader.load(IButton.class);
		for(IButton button : buttonPlugins) {
			String key = button.getClass().getName(); 
			iButtonHashMap.put(key, button); 
		}		
	}
	
	
	private void placeButton() {
		
		for(String key : iButtonHashMap.keySet()) {
			JButton button = iButtonHashMap.get(key).getButton(); 
			
			
			if(key == "AddPic") {
				button.addActionListener(new ButtonListener("addPic"));
				this.add(button, BorderLayout.SOUTH);
				
			}
			
			if(key == "DeletePic") {
				button.addActionListener(new ButtonListener("deletePic"));
				this.add(button, BorderLayout.EAST);
			
			}
			
			
			buttons.put(key, button);
		}		
	}


	
	
	public void display() {

		
		if (table == null) {
			
			table = new JTable(this.fillTable(), this.fillColumnNames());
			table.setRowHeight(750/(columnCount));
			this.add(table, BorderLayout.CENTER);
			

		}
		else {
			
			
			//TODO refresh GUI
			
		}
		
	}
	
}
