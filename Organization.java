package a2;

import java.util.ArrayList;
public class Organization {
	String name;
	Admin admin;
	ArrayList<Entity> entityList;
	ArrayList<Donator> donatorList;
	ArrayList<Beneficiary>   beneficiaryList;
	RequestDonationList currentDonations;
	
	Organization(String n)
	{
		name=n;
		admin=null;
		entityList=new ArrayList<Entity>();
		donatorList=new ArrayList<Donator>();
		beneficiaryList=new ArrayList<Beneficiary>();
		currentDonations=new RequestDonationList();
		
		
	}
	
	void setAdmin(Admin a)
	{
		admin=a;
	}
	
	Admin getAdmin()
	{
		return admin;
	}
	
	void addEntity(Entity e) throws MyException
	{
		for (Entity i: entityList)
		{
			if(i.id==e.id)
			{
				throw new MyException("Exist entity");
			}
		}
		entityList.add(e);
		
	}
	
	void removeEntity(Entity e) 
	{
		for (Entity i: entityList)
		{
			if(i.id==e.id)
			{
				entityList.remove(i);
				break;
			}
		}
		
		
	}
	
	void insertDonator(Donator e) throws MyException
	{
		for (Donator i: donatorList)
		{
			if(i.name.equals(e.name))
			{
				throw new MyException("Donator Exists");
			}
		}
		donatorList.add(e);
		
	}
	
	
	void removeDonator(Donator e) 
	{
		for (Donator i: donatorList)
		{
			if(i.name.equals(e.name))
			{
				donatorList.remove(i);
				break;
			}
		}
		
		
	}
	
	void insertBeneficiary(Beneficiary e) throws MyException
	{
		for (Beneficiary i: beneficiaryList)
		{
			
			if(i.name.equals(e.name))
			{
				throw new MyException("Donator Exists");
			}
		}
		beneficiaryList.add(e);
	}
	
	void removeBeneficiary(Beneficiary e) 
	{
		for (Beneficiary i:  beneficiaryList)
		{
			if(i.name.equals(e.name))
			{
				 beneficiaryList.remove(i);
				break;
			}
		}
		
		
	}
	
	void listEntities()
	{
		System.out.println("Materials");
		for (Entity i :  entityList)
		{	
			
			i.getDetails();
		}
	}
	
	void listBeneficiaries()
	{
		System.out.println("Beneficiaries:");
		System.out.println("-----------------");
		for (Beneficiary b:beneficiaryList )
		{
			b.show();
		}
	}
	
	void listDonators()
	{
		System.out.println("Donators:");
		System.out.println("-----------------");
		for (Donator d:donatorList )
		{
			System.out.println(d.name);
		}
	}
}
