package inheritance;

public class Orthologist extends Doctor {
	String spe;
	String organ;
	
	public  Orthologist() {
		
	}

	public  Orthologist(String name, double fees, String degree, int exp, String hospital ,String spe,String organ) {
		this.name=name;
		this.fees=fees;
		this.degree=degree;
		this.exp=exp;
		this.hospital=hospital;
		
		this.spe=spe;
		this.organ=organ;

	}
	public void displayOrthologist() {
		displayDoctor();
		System.out.println(spe);
		System.out.println(organ);
	}

}


