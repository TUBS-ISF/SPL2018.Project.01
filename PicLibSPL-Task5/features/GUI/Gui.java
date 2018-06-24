//package ui;

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


 

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	
	//int columnCount = 0;
	
	public static Gui instance = null;
	JTable table = null;
	
	Vector<String> propNames = new Vector<String>(); //mein altes
	
	Vector<String> colNames = new Vector<String>();
	HashMap<Number, Picture> picControllerCollection;
	int columnCount = 10;
	String[] columnNames = new String[columnCount];
	Picture[] tempPictures = new Picture[10];
	Object[][] o = new Object[10][columnCount];
	int propCounter = 0;
	int pictureCounter =0;
	
		
	public Gui() {
		
		instance = this;
		
		setLayout(new BorderLayout());
		
		/*/TODO hier
		display();				
		initIButtonHashMap();
		placeButton();
		*/
		
		this.setSize(new Dimension(750, 750));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new JScrollPane(table));
			
	}
	
	
	public void init() {
		
		picControllerCollection = PicController.getInstance().getPicCollection();
		colNames = new Vector<String>();
			    
	    this.createColumnNames();
	    String[] correctColumnNames = new String[picControllerCollection.get(1).propertyNumber];
	    
	    //Fix für ein spät aufgertetenes Problem, geht sicherlich ordentlicher
	    for(int i=0; i< correctColumnNames.length; i++) {
	    	correctColumnNames[i] = columnNames[i]; 
		}
	    
	  
	    
	    //ebenfalls für das Object O hier anpassen
	    
	    
	    
	    //Forschleife zum rüberkopieren
	    
	    this.fillTable();
	    
	    Object[][] o2 = new Object[picControllerCollection.size()][picControllerCollection.get(1).propertyNumber];
	    
	    //BuildAround um einen Konzept/Plannungsfehler meinerseits
	    for(int i = 0;i <picControllerCollection.size(); i++) {
	    	for(int j = 0; j<picControllerCollection.get(1).propertyNumber;j++) {
	    		o2[i][j] = o[i][j];
	    	}
	    }
	    
	    table = new JTable(o2, correctColumnNames); //man kann auch Vectoren übergeben, damit variable?
	    this.add(table, BorderLayout.CENTER);
		
	    
	}
	  
	
	public void createColumnNames() {
		
		
		if(picControllerCollection.isEmpty()) {
			System.out.println("Leere Bibliothek");
		}
		
		
		original();
		
		for(int i=0; i< colNames.size(); i++) {
			columnNames[i] = colNames.get(i);
		}
	}
	
	
	public void fillTable() {
		
		for(Number n: picControllerCollection.keySet()) {	
				
			
			tempPictures[pictureCounter] = picControllerCollection.get(n);
			System.out.println("n " + n);
			
			//hier
			o[pictureCounter][propCounter] = tempPictures[pictureCounter].getName();
			
			
			
			propCounter++;
			original();
			
			pictureCounter++;
			propCounter = 0;	
			
			}    
	}
	
	public static Gui getInstance() {
		
		if(instance == null) {
			instance = new Gui();
		}
		return instance;
	}
	
	
}
