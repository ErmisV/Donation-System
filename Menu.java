package a2;
import java.util.Scanner;  
public class Menu {
	Scanner inp = new Scanner(System.in);
	Beneficiary ub;
	Donator ud;
	Admin ua;
	Organization o;
	Menu(Organization o)
	{
		this.o=o;
		while(true)
		{
		
			System.out.println("Give phone:");
			String p=inp.nextLine();
			
			int f=0;
			if(o.admin.getPhone().equals(p) )
			{
				f=1;
				ua=o.admin;
				
			}
			if(f==0)
			for (Beneficiary b : o.beneficiaryList)
			{
				if (b.phone.equals(o))
				{
					ub=b;
					f=2;
				}
			}
			if(f==0)
			for (Donator b : o.donatorList)
				{
					if (b.phone.equals(o))
					{
						ud=b;
						f=3;
					}
				}
			
			if(f==0)
			{
				System.out.println("Do you want to register (y/n)?");
				String q=inp.nextLine();
				if(q.equals("y"))
				{
					System.out.println("1. Donator, 2. Beneficiary:");
					String q2=inp.nextLine();
					
					if(q2.equals("1"))
					{
						System.out.println("Name:");
						String n=inp.nextLine();
						
						Donator d=new Donator(n,p);
						o.donatorList.add(d);
						ud=d;
					}
					if(q2.equals("2"))
					{
						System.out.println("Name:");
						String n=inp.nextLine();
						
						System.out.println("Number of person:");
						int p1=Integer.parseInt(inp.nextLine());
						
						Beneficiary d=new Beneficiary(n,p,p1);
						o.beneficiaryList.add(d);
						ub=d;
					}
					
				}
				else
				{
					System.out.println("thanks");
					return;
				}
			}
			
			
				if(f==1)
				{
					
					menuadmin();
					
					
				}
				
				if(f==2)
				{
					
					menuben();
					
					
				}
				
				if(f==3)
				{
					
					menudon();
					
					
				}
		}
		
	}
	
	void menuadmin()
	{
		while(true)
		{
		System.out.println("1. View");
		System.out.println("2. Monitor Organization");
		System.out.println("1. View");
		System.out.println("4. Logout");
		System.out.println("5. �xit");
		
		String x=inp.nextLine();
		if(x.equals("4"))
		{
			return;
		}
		
		
		if(x.equals("5"))
		{
			System.exit(1);
		}
		
		
		}
		
	}
	
	void menuben()
	{
		while(true)
		{
		
		System.out.println("1. Add Request");
		System.out.println("2. Show Requests");
		System.out.println("1. Commit");
		System.out.println("4. Logout");
		System.out.println("5. �xit");
		
		String x=inp.nextLine();
		if(x.equals("4"))
		{
			return;
		}
		
		if(x.equals("5"))
		{
			System.exit(1);
		}
		
		
		}
	}
	
	void menudon()
	{
		while(true)
		{
		
		System.out.println("1. Add Offer");
		System.out.println("2. Show Offers");
		System.out.println("1. Commit");
		System.out.println("4. Logout");
		System.out.println("5. �xit");
		
		String x=inp.nextLine();
		if(x.equals("4"))
		{
			return;
		}
		
		
		if(x.equals("5"))
		{
			System.exit(1);
		}
		
		}
		
	}
	
	
	

	

}
