import interfaces.IProperty;

public class Place implements IProperty{

	String place;
	
	@Override
	public void init(String string) {
		this.place = string;
	}
	
	@Override
	public String getValue(){
		return place;
	}
	
	@Override
	public void setValue(String string){
		this.place = string;
	}
	
}
