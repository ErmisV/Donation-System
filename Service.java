package a2;

public class Service extends Entity{
	Service(String n, String d, int id )
	{
		super(n,d,id);
		
	}
	
	String getDetails() {
		return "Details:"+super.getEntityInfo()+" is Service";
	}
}
