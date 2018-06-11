import interfaces.IProperty;

public class Time implements IProperty{

	String time;
	
	@Override
	public void init(String string) {
		this.time = string;
	}
	
	@Override
	public String getValue(){
		return time;
	}
	
	@Override
	public void setValue(String string){
		this.time = string;
	}
	
}
