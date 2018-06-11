import interfaces.IProperty;

public class Resource implements IProperty{

	String resource;
	
	@Override
	public void init(String string) {
		this.resource = string;
	}
	
	@Override
	public String getValue(){
		return resource;
	}
	
	@Override
	public void setValue(String string){
		this.resource = string;
	}
	
}
