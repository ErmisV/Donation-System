package a2;

public class Admin extends User {
	boolean isAdmin;
	Admin()
	{
		super();
		isAdmin=true;
	}
	
	Admin(String n,String p){
		super(n,p); 
		isAdmin=true;
	}
	
	void setnotAdmin()
	{
		isAdmin=false;
		
	}
	void setAdmin()
	{
		isAdmin=true;
	}
	
	boolean getAdmin()
	{
		return isAdmin;
	}

}
