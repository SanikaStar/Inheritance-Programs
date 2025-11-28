package inheritance;

public class Son extends Father{
	String name="Satish";
	
	public void displayName() {
		System.out.println("Son name:"+name);
	}
   public void displayFatherSonDetail() {
	   System.out.println(name);
	   System.out.println(super.name);
	   //System.out.println(super);
	  displayName();
	  super.displayName();
   }
}
