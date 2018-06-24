
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//newpic();
		
	}
	
	public Picture newpic(){
		
		Picture pic = new Picture();
		pic.setName("001");
		pic.setPlace("gpskoord0001");
		pic.setTime("1");
		pic.setFormat("png");
		pic.setResource("/Desert.jpg");	
		
		return pic;
		
	}
	
}
