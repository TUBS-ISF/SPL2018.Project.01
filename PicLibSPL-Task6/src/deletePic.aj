import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public aspect deletePic {

	
	private class AddDeleteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//TODO
		}
	
	}
	
	    
    after(): execution(public void GuiJ.init()) {
    	
        JButton addButton = new JButton("deletePic");
    	addButton.addActionListener(new AddDeleteListener());
        GuiJ.getInstance().add(addButton, BorderLayout.EAST);
	}
	
}
