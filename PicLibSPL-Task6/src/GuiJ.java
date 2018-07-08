
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

 
public class GuiJ extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static GuiJ instance= null;
	
	static Color color;
	
	
	JTable table = null;
	Vector<String> propNames = new Vector<String>();
	
	Vector<String> colNames = new Vector<String>();
	HashMap<Number, PictureJ> picControllerCollection;
	int columnCount = 10;
	String[] columnNames = new String[columnCount];
	PictureJ[] tempPictures = new PictureJ[10];
	Object[][] o = new Object[10][columnCount];
	int propCounter = 0;
	int pictureCounter =0;
	int propNumber=0;
	String[] correctColumnNames = new String[propNumber];
	
	
	public GuiJ() {
		
		instance = this;
		
		setLayout(new BorderLayout());
		
		picControllerCollection = PicController.getInstance().getPicCollection();
		this.createColumnNames();
		this.init();
		
		this.setSize(new Dimension(750, 750));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		table.setBackground(color);
		table.setRowHeight(750/propNumber);
		
		add(new JScrollPane(table));
			
	}
	
	public void init() {
		
		
		colNames = new Vector<String>();
			    
	   
	    
	    String[] correctColumnNames = new String[propNumber];
	    
	 
	    for(int i=0; i< correctColumnNames.length; i++) {
	    	correctColumnNames[i] = columnNames[i]; 
		}
	    
	    this.fillTable();
	    
	    Object[][] o2 = new Object[picControllerCollection.size()][this.propNumber];
	    
	    
	    for(int i = 0;i <picControllerCollection.size(); i++) {
	    	for(int j = 0; j<this.propNumber;j++) {
	    		o2[i][j] = o[i][j];
	    	}
	    }
	    
	    table = new JTable(o2, correctColumnNames); 
	    this.add(table, BorderLayout.CENTER);
		
	    
	}
	
	public void createColumnNames() {
		
		
		if(picControllerCollection.isEmpty()) {
			System.out.println("Leere Bibliothek");
		}
		
		
		for(int i=0; i< colNames.size(); i++) {
			columnNames[i] = colNames.get(i);
		}
	}
	
	public void fillTable() {
		
		for(Number n: picControllerCollection.keySet()) {	
				
			
			tempPictures[pictureCounter] = picControllerCollection.get(n);
			System.out.println("n " + n);
			
			//hier
			this.fillPicture();
			
			pictureCounter++;
			
			propCounter = 0;	
			
			}    
			
	}
	
	public Color getColorscheme() {
		return color;
	}
	public void setColorScheme(Color colorscheme) {
		color = colorscheme;
	}
	
	
	public static GuiJ getInstance() {
		
		if(instance == null) {
			instance = new GuiJ();
		}
		return instance;
	}
	
	public void fillPicture (){
		//Leere Methode als Jointpoint für die Aspekte
	}
	
	
	
	
	

	
}
