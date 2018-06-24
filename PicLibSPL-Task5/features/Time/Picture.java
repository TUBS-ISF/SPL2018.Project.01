
import java.util.List;

//import com.sun.org.apache.xerces.internal.dom.AttributeMap;

import java.util.HashMap;



public class Picture {
	
	String time;
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	private void generatePropertyNumber() {
		original();
		propertyNumber++;
	}

}