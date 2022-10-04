package a2;

public class RequestDonation {
	Entity e;
	double quantity;
	
	RequestDonation(Entity e,double q)
	{
		this.e=e;
		quantity=q;
	}
	
	boolean isSame(RequestDonation a)
	{
		if(this.e.id==a.e.id)
			return true;
		else 
			return false;
	}
}
