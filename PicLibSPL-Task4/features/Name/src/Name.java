import interfaces.IProperty;

public class Name implements IProperty{

	String name;
	
	@Override
	public void init(String string) {
		this.name = string;
	}
	
	@Override
	public String getValue(){
		return name;
	}
	
	@Override
	public void setValue(String string){
		this.name = string;
	}

}