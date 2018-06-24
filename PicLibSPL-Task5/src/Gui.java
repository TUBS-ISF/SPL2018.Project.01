
import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Dimension; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JList; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 

import java.util.HashMap; 
import java.util.List; 
import java.util.Vector; 
import java.awt.Image; 

import javax.swing.ImageIcon; 
import javax.swing.JLabel; 


public   class  Gui  extends JFrame {
	
	
	 private void  createColumnNames__wrappee__Name  () {
		
		//original();
		colNames.add("Name");	
		
	}

	
	
	 private void  createColumnNames__wrappee__Place  () {
		
		createColumnNames__wrappee__Name();
		colNames.add("Place");
		
	}

	
	
	 private void  createColumnNames__wrappee__Time  () {
		
		createColumnNames__wrappee__Place();
		colNames.add("Time");
				
	}

	
	
	
	
	 private void  createColumnNames__wrappee__Format  () {
		
		createColumnNames__wrappee__Time();
		colNames.add("Format");	
		
	}

	
	
	 private void  createColumnNames__wrappee__Resource  () {
		
		createColumnNames__wrappee__Format();
		colNames.add("Resource");
		
	}

	
	  
	
	public void createColumnNames() {
		
		
		if(picControllerCollection.isEmpty()) {
			System.out.println("Leere Bibliothek");
		}
		
		
		createColumnNames__wrappee__Resource();
		
		for(int i=0; i< colNames.size(); i++) {
			columnNames[i] = colNames.get(i);
		}
	}

	
	
	 private void  fillTable__wrappee__Name  () {
		
		//original();
		o[pictureCounter][propCounter] = tempPictures[pictureCounter].getName();
		propCounter++;
	}

	
	
	 private void  fillTable__wrappee__Place  () {
		
		fillTable__wrappee__Name();
		o[pictureCounter][propCounter] = tempPictures[pictureCounter].getPlace();
		propCounter++;
	}

	
	
	 private void  fillTable__wrappee__Time  () {
		
		fillTable__wrappee__Place();
		o[pictureCounter][propCounter] = tempPictures[pictureCounter].getTime();
		propCounter++;
	}

	
	
	 private void  fillTable__wrappee__Format  () {
		
		fillTable__wrappee__Time();
		o[pictureCounter][propCounter] = tempPictures[pictureCounter].getFormat();
		propCounter++;
	}

	
	
	 private void  fillTable__wrappee__Resource  () {
		
		fillTable__wrappee__Format();
		o[pictureCounter][propCounter] = tempPictures[pictureCounter].getResource();
		propCounter++;
	}

	
	
	
	public void fillTable() {
		
		for(Number n: picControllerCollection.keySet()) {	
				
			
			tempPictures[pictureCounter] = picControllerCollection.get(n);
			System.out.println("n " + n);
			
			//hier
			o[pictureCounter][propCounter] = tempPictures[pictureCounter].getName();
			
			
			
			propCounter++;
			fillTable__wrappee__Resource();
			
			pictureCounter++;
			propCounter = 0;	
			
			}    
	}

	

	private static final long serialVersionUID = 1L;

	
	
	//int columnCount = 0;
	
	public static Gui instance = null;

	
	JTable table = null;

	
	
	Vector<String> propNames = new Vector<String>();

	 //mein altes
	
	Vector<String> colNames = new Vector<String>();

	
	HashMap<Number, Picture> picControllerCollection;

	
	int columnCount = 10;

	
	String[] columnNames = new String[columnCount];

	
	Picture[] tempPictures = new Picture[10];

	
	Object[][] o = new Object[10][columnCount];

	
	int propCounter = 0;

	
	int pictureCounter =0;

	

	
	
	public Gui  () {
		
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
			
	
		
		JButton addButton = new JButton("addPic");
		addButton.addActionListener(new ButtonListener());
		this.add(addButton, BorderLayout.SOUTH);
	
	
		
		JButton deleteButton = new JButton("deletePic");
		deleteButton.addActionListener(new ButtonListener());
		this.add(deleteButton, BorderLayout.EAST);
	
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

	
	
	public static Gui getInstance() {
		
		if(instance == null) {
			instance = new Gui();
		}
		return instance;
	}


}
