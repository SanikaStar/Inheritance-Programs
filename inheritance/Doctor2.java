package inheritance;

public class Doctor2{

	String name;
	double fees;
	String degree;
	int exp;
	String hospital;
	
	
	public Doctor2()
	{
		
	}
	
	public Doctor2(String name,double fees,String degree,int exp,String hospital)
	{
	this.name=name;
	this.fees=fees;
	this.degree=degree;
	this.exp=exp;
	this.hospital=hospital;
	}
	public void displayDoctor2()
	{
		System.out.println(name);
		System.out.println(fees);
		System.out.println(degree);
		System.out.println(exp);
		System.out.println(hospital);
		
		
		
	}
	
}
