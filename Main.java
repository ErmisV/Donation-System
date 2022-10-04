package a2;

public class Main {

	public static void main (String arg[])
	{
		Organization o=new Organization("Org1");
		Admin a=new Admin("admin","1234");
		o.admin=a;
		Donator d=new Donator("don","1111");
		o.donatorList.add(d);
		Beneficiary b1=new Beneficiary("b1","1212");
		Beneficiary b2=new Beneficiary("b2","1313");
		o.beneficiaryList.add(b1);
		o.beneficiaryList.add(b2);
		
		Menu m=new Menu(o);
	}
}
