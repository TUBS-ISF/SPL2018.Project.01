
import java.util.List;

//import com.sun.org.apache.xerces.internal.dom.AttributeMap;

import java.util.HashMap;



public class Picture {
	
	String format;
	
	public String getFormat() {
		return format;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	private void generatePropertyNumber() {
		original();
		propertyNumber++;
	}

}