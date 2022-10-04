package a2;

public class Donator extends User{
	Offers  offersList;
	Donator()
	{
		super();
		offersList=new Offers();
	}
	
	Donator(String n, String p)
	{
		super(n,p);
		offersList=new Offers();
	}
	
	void add(RequestDonation a)
	{
		offersList.add(a);
	}
	
	void remove(int id)
	{
		offersList.remove(id);
	}
	
	void modify(int id,double q)
	{
		offersList.modify(id, q);
		
	}
	
	void monitor()
	{
		
		offersList.monitor();
	}
	
	void reset()
	{
		offersList.reset();
	}
	
	void commit(RequestDonationList c)
	{
		offersList.commit(c);
	}
	
}
