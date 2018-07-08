import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public aspect addPic {

	public class AddPicListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	
	}
	
	    
    after(): execution(public void GuiJ.init()) {
    	
        JButton addButton = new JButton("addPic");
    	addButton.addActionListener(new AddPicListener());
        GuiJ.getInstance().add(addButton, BorderLayout.SOUTH);
	}	
	
}
