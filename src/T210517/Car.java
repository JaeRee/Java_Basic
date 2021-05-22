package T210517;

public class Car extends Object{
	
	String color;
	int door;
	boolean power;
	
	
	
	
	Car(){
		color = "black";
		door=4;
		power = false;
	}
	
	Car(String c, int door, boolean p){
		this.color = c;
		this.door=4;
		this.power = p;
	}
	
	
	void powerOn() {
		power = true;
	}
	
	
	
	
	Car(String color){
		super();
		this.color = color;
		door = 3;
	}
	
	
	void start() {
		System.out.println("√‚πﬂ«’¥œ¥Ÿ.");
	}
	
	void stop() {
		System.out.println("∏ÿ√‰¥œ¥Ÿ.");
	}
	
}