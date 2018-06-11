import interfaces.IProperty;

public class Format implements IProperty{

	String format;
	
	@Override
	public void init(String string) {
		this.format = string;
	}
	
	@Override
	public String getValue(){
		return format;
	}
	
	@Override
	public void setValue(String string){
		this.format = string;
	}

}