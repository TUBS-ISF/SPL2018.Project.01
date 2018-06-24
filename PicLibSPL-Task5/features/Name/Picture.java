
import java.util.List;

//import com.sun.org.apache.xerces.internal.dom.AttributeMap;

import java.util.HashMap;



public class Picture {
	
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private void generatePropertyNumber() {
		original();
		propertyNumber++;
	}

}