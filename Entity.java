package a2;

public abstract class Entity {
	String name;
	String description;
	int id;
	Entity(String n, String d, int id)
	{
		name=n;
		description=d;
		this.id=id;
	}
	
	String getEntityInfo() {
		return name+" "+description+" "+id;
	}
	String getDetails() {
		return "Details:"+getEntityInfo();
	}
	
	boolean isSame(Entity a)
	{
		if(this.id==a.id)
			return true;
		else 
			return false;
	}
	public String toString() {
		return getDetails();
	}
}
