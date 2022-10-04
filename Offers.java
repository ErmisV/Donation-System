package a2;

public class Offers extends RequestDonationList {
	Offers()
	{
		super();
	}
	
	void commit(RequestDonationList c)
	{
		for (RequestDonation e : this.rdEntities)
		{
			c.add(e);
		}
		this.reset();
	}
}
