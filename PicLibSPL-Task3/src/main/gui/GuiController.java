package main.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JList;
//import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import javax.swing.JLabel;

import java.util.HashMap;
import java.util.Vector;

import main.pic.Pic;
import main.pic.PicController;


public class GuiController extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	int columnCount = 0;
	JTable table = null;
	Vector<String> propNames;
	JLabel label = null;
	JFrame frame = null;
	
	
	public GuiController() {
		setLayout(new BorderLayout());
		
		
		JButton button = new JButton("addPic");
		button.addActionListener(new AddPicListener());
		propNames = new Vector<String>();
		table = new JTable(this.fillTable(), this.fillColumnNames());
		table.setRowHeight(750/columnnumber());
		this.add(table, BorderLayout.CENTER);
		
		
		
		
		//#ifdef addPic
			this.add(button, BorderLayout.SOUTH);
		//#endif
		
		this.setSize(new Dimension(750, 750));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JScrollPane(table));
	}
	
	public int columnnumber() {
		
		int mega = 0;
		
		//#if Picture
			mega++;
		//#endif
			
		//#ifdef Name
			mega++;
		//#endif
		
		//#ifdef Place
			mega++;
		//#endif
		
		//#ifdef Time
			mega++;
		//#endif
		
		//#ifdef Format
			mega++;
		//#endif
			
		return mega;
	}
	
	
	public String[] fillColumnNames() {
		
		//#if Picture
			propNames.addElement("Picture");
		//#endif
			
			
		//#ifdef Name
			propNames.addElement("Name");
		//#endif
		
		//#ifdef Place
			propNames.addElement("Place");
		//#endif
		
		//#ifdef Time
			propNames.addElement("Time");
		//#endif
		
		//#ifdef Format
			propNames.addElement("Format");
		//#endif
		
		String[] columnName = new String[propNames.size()];
		
		for(int i=0; i<propNames.size(); i++) {
			columnName[i] = propNames.get(i);
		}
		
		columnCount = columnName.length;
		return columnName;
		
	}
	
	public Object[][] fillTable() {
		
		HashMap<Number, Pic> p= PicController.getInstance().getPicCollection();
		
		Object[][] o = new Object[p.size()][7]; //TODO
		
		int counter = 0;
		for(Number n: p.keySet()) {
			
			//#if Picture
				label = new JLabel();
				frame = new JFrame();
				
				//Image img = new ImageIcon(this.getClass().getResource(p.get(n).getResources())).getImage();
				//label.setIcon(new ImageIcon(img));
				
				label.setBounds(1, counter * (750/columnnumber()) + 21, 750/columnnumber()-5, 750/columnnumber()-1);
				o[counter][0] = add(label);
			//#endif
				
			//#ifdef Name
				o[counter][1] = p.get(n).getName();
			//#endif
			
			//#ifdef Place
				o[counter][2] = p.get(n).getPlace();
			//#endif
			
			//#ifdef Time
				o[counter][3] = p.get(n).getTime();
			//#endif
			
			//#ifdef Format
				o[counter][4] = p.get(n).getFormat();
			//#endif
			
			
			
			counter++;
			
		}
		
		return o;
		
	}
	
}
