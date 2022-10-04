package a2;

public class Beneficiary extends User {
	int noPersons;
	RequestDonationList receivedList;
	Requests requestsList;
	
	Beneficiary()
	{
		super();
		noPersons=1;
		receivedList=new RequestDonationList();
		requestsList=new Requests();
	}
	
	Beneficiary(String n, String p)
	{
		super(n,p);
		noPersons=1;
		receivedList=new RequestDonationList();
		requestsList=new Requests();
	}
	
	Beneficiary(String n, String p, int np)
	{
		super(n,p);
		noPersons=np;
		receivedList=new RequestDonationList();
		requestsList=new Requests();
	}
	
	void show()
	{
		System.out.println("Name:"+name);
		for (RequestDonation r: receivedList.rdEntities)
		{
			System.out.println("Recieve:"+r.e.getDetails()+" "+r.quantity);
		}
	}
}
