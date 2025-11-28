package inheritance;

public class Cardiologist2 extends Doctor2 {
	String spe;
	String organ;
	
	public Cardiologist2()
	{
		
	}
	public Cardiologist2(String name,double fees,String degree,int exp,String hospital,String spe,String organ)
	{
		super(name,fees,degree,exp,hospital);
		
		this.spe=spe;
		this.organ=organ;
	}
	
	public void displayCardiologist2() {
		displayDoctor2();
		System.out.println(spe);
		System.out.println(organ);
	}
	

}
