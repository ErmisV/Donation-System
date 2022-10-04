package a2;

public class Requests extends RequestDonationList {
	Requests()
	{
		super();
	}
	
	
	void add(RequestDonation a, Organization o)
	{
		boolean f=false;
		
		
		for (RequestDonation i: rdEntities )
		{
			if(i.isSame(a))
			{
				
				i.quantity=i.quantity+a.quantity;
				f=true;
				break;
			}
		}
		
		if(!f)
		{
			rdEntities.add(a);
		}
	}
}
