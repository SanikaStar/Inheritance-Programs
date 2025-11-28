package inheritance;

public class DoctorDriver {
public static void main(String[] args) {
	Cardiologist c1=new Cardiologist("Sanika",300.0,"MBBS",2,"Sahyadri Hospital","MD(Cardio)","Heart");
	c1.displayDoctor();
	System.out.println("-------");
	c1.displayCardiologist();
	System.out.println("***********");
	
	
	Neurologist n1=new Neurologist("Prajakta",800.0,"MBBS",4,"Poona Hospital","MD(Neuro)","Brain");
	n1.displayDoctor();
	System.out.println("-------");
	n1.displayNeurologist();
	System.out.println("***********");
	
	Orthologist o1=new Orthologist("Pooja",500.0,"MBBS",6,"Pooja Hospital","MD(Ortho)","Bone");
	o1.displayDoctor();
	System.out.println("-------");
	o1.displayOrthologist();
	System.out.println("***********");
}
}
