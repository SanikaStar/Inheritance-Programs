package inheritance;

public class Sukhai extends Fighterplane {
	String model;

	String weapons;
	
	String country;
	
	public Sukhai() {
		
	}
    
	public Sukhai(String brand, double price, int engines, int year, int fuelcap, int speed, int wt, int cap,
	int gen ,int seat,int range,String type,String refuel,String model,String weapons,String country) {
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelcap = fuelcap;
		this.speed = speed;
		this.wt = wt;
		this.cap = cap;
		
		this.gen=gen;
		this.seat=seat;
		this.range=range;
		this.type=type;
		this.refuel=refuel;
		
		this.model=model;
		this.weapons=weapons;
		
		this.country=country;
		
	}
	public void displaySukhai() {
		displayFighterplane();
		System.out.println(model);
		System.out.println(weapons);
		
		System.out.println(country);
	}
}
