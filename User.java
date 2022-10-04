package a2;

public class User {
	String name;
	String phone;
	
	User(){
		name="";
		phone="";
		
	}
	
	User(String n, String p)
	{
		name=n;
		phone=p;
	}
	
	void setName(String n)
	{
		name=n;
	}
	
	void setPhone(String p)
	{
		phone=p;
	}
	
	String getName()
	{
		return name;
	}
	
	String getPhone()
	{
		
		return phone;
	}
}
