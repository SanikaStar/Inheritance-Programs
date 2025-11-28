package inheritance;

public class Daughter extends Father2{
	String name="sanika";
	
	public void displayName() {
		System.out.println("Daughter name:"+name);
		System.out.println(super.name);
		super.displayName();
	}

}
