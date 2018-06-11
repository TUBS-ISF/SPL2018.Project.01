import interfaces.IButton;
import javax.swing.JButton;


public class DeletePic implements IButton{

	@Override
	public JButton getButton() {
		JButton button = new JButton("deletePic");
		return button;
	}
}
