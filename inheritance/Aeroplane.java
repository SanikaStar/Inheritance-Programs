package inheritance;

public class Aeroplane {
	String brand;
	double price;
	int engines;
	int year;
	int fuelcap;
	int speed;
	int wt;
	int cap;
	
	public Aeroplane() {
		
	}

	public Aeroplane(String brand, double price, int engines, int year, int fuelcap, int speed, int wt, int cap) {
		
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelcap = fuelcap;
		this.speed = speed;
		this.wt = wt;
		this.cap = cap;
	}

	 public void displayAeroplane() {
		 System.out.println(brand);
		 System.out.println(price);
		 System.out.println(engines);
		 System.out.println(year);
		 System.out.println(fuelcap);
		 System.out.println(speed);
		 System.out.println(wt);
		 System.out.println(cap);
		 
	 }

}
