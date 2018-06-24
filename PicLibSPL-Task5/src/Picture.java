
import java.util.List; 

//import com.sun.org.apache.xerces.internal.dom.AttributeMap;

import java.util.HashMap; 



public   class  Picture {
	
		
	int pictureKey;

	
	int propertyNumber	=1;

	
	
	public Picture() {
		
	}

	
	
	public int getPictureKey() {
		return pictureKey;
	}

	

	public void setPictureKey(int pictureKey) {
		this.pictureKey = pictureKey;
	}

	
	
	public int getPropertyNumber(){
		return propertyNumber;
	}

	
	
	 private void  generatePropertyNumber__wrappee__Picture  () {
		//every Feature rises this Number, usefull for later
		
	}

	
	
	 private void  generatePropertyNumber__wrappee__Name  () {
		generatePropertyNumber__wrappee__Picture();
		propertyNumber++;
	}

	
	
	 private void  generatePropertyNumber__wrappee__Place  () {
		generatePropertyNumber__wrappee__Name();
		propertyNumber++;
	}

	
	
	 private void  generatePropertyNumber__wrappee__Time  () {
		generatePropertyNumber__wrappee__Place();
		propertyNumber++;
	}

	
	
	 private void  generatePropertyNumber__wrappee__Format  () {
		generatePropertyNumber__wrappee__Time();
		propertyNumber++;
	}

	
	
	private void generatePropertyNumber() {
		generatePropertyNumber__wrappee__Format();
		propertyNumber++;
	}

	
	
	String name;

	
	
	public String getName() {
		return name;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	
	
	String place;

	
	
	public String getPlace() {
		return place;
	}

	
	
	public void setPlace(String place) {
		this.place = place;
	}

	
	
	String time;

	
	
	public String getTime() {
		return time;
	}

	
	
	public void setTime(String time) {
		this.time = time;
	}

	
	
	String format;

	
	
	public String getFormat() {
		return format;
	}

	
	
	public void setFormat(String format) {
		this.format = format;
	}

	
	
	String resource;

	
	
	public String getResource() {
		return resource;
	}

	
	
	public void setResource(String resource) {
		this.resource = resource;
	}


}
