
import java.util.List;

//import com.sun.org.apache.xerces.internal.dom.AttributeMap;

import java.util.HashMap;



public class Picture {
	
	String place;
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	private void generatePropertyNumber() {
		original();
		propertyNumber++;
	}

}