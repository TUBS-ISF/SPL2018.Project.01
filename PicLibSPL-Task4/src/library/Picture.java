package library;

import java.util.List;

//import com.sun.org.apache.xerces.internal.dom.AttributeMap;

import java.util.HashMap;

import interfaces.IProperty;
import loader.PluginLoader;


public class Picture {

	private HashMap<String, IProperty> propertyMap = new HashMap<String,IProperty >();
		
	int pictureKey;
	
	public Picture() {
		
		List<IProperty> picPropPlugins = PluginLoader.load(IProperty.class);
				
		for(IProperty prop : picPropPlugins){
			String key = prop.getClass().getName(); 
			propertyMap.put(key, prop); 
		
		}

		
	}
	
	
	public HashMap<String, IProperty> getPropertytMap() {
		return propertyMap;
	}
	
	public void setProperty(String key, String value) {
		propertyMap.get(key).setValue(value);
	}
		
	
	public int getPictureKey() {
		return pictureKey;
	}
	
	public void setPictureKey(int pictureKey) {
		this.pictureKey = pictureKey;
	}
	
	
	
}
