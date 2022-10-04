package a2;

public class Material extends Entity{
	double level1,level2, level3;
	
	Material(String n,String d,int id,double l1,double l2,double l3)
	{
		super(n,d,id);
		level1=l1;
		level2=l2;
		level3=l3;
				
	}
	
	String getDetails() {
		return "Details:"+super.getEntityInfo()+" Levels:"+level1+" "+level2+" "+level3;
	}
}
