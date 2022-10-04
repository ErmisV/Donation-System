package a2;
import java.util.ArrayList;
public class RequestDonationList {
	ArrayList<RequestDonation> rdEntities ;
	
	RequestDonationList()
	{
		rdEntities=new ArrayList<RequestDonation>();
	}
	RequestDonation get(int id)
	{
		
		for (RequestDonation i: rdEntities )
		{
			if(i.e.id==id)
			{
				return i;
				
				
			}
		}
		return null;
	}
	
	void add(RequestDonation a)
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
	
	void remove(int id)
	{
		boolean f=false;
		RequestDonation x=null;
		for (RequestDonation i: rdEntities )
		{
			if(i.e.id==id)
			{
				x=i;
				f=true;
				break;
			}
		}
		
		if(!f)
		{
			rdEntities.remove(x);
		}
	}
	
	void modify(int id,double q)
	{
		boolean f=false;
		RequestDonation x=null;
		for (RequestDonation i: rdEntities )
		{
			if(i.e.id==id)
			{
				x=i;
				f=true;
				break;
			}
		}
		
		if(!f)
		{
			x.quantity=q;
		}
	}
	
	void monitor()
	{
		
		for (RequestDonation i: rdEntities )
		{
			System.out.println(i.e.toString()+" quantity:"+i.quantity);
		}
	}
	
	void reset()
	{
		rdEntities.clear();
	}
	
	
}
