
import java.util.List;

//import com.sun.org.apache.xerces.internal.dom.AttributeMap;

import java.util.HashMap;



public class Picture {
	
	String resource;
	
	public String getResource() {
		return resource;
	}
	
	public void setResource(String resource) {
		this.resource = resource;
	}
	
	private void generatePropertyNumber() {
		original();
		propertyNumber++;
	}

}