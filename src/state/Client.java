package state;

public class Client {

	public static void main(String[] args) {
		
		// All object of gear are kept with common interface type IState
		// Actual type will be resolved at runtime
		IState gear1 = new Gear1State();
		IState gear2 = new Gear2State();
		IState gear3 = new Gear3State();
		IState gear4 = new Gear4State();

		// Bike object whose internal State named "gear", decides the behavior of Bike.
		//An object - "bike" should change its behavior when its internal state "gear" changes.
		Bike bike = new Bike();
		bike.setGear(gear1);
		System.out.println("SPEED : - " + bike.getBikeSpeed());
		
		bike.setGear(gear4);
		System.out.println("SPEED : - " + bike.getBikeSpeed());
	}
}
