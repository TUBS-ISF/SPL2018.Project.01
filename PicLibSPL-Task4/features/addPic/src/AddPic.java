import interfaces.IButton;
import javax.swing.JButton;


public class AddPic implements IButton{

	@Override
	public JButton getButton() {
		JButton button = new JButton("addPic");
		return button;
	}
}
