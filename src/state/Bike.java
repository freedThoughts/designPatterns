package state;

public class Bike {
	
	// Actual object type of gear will be resolved at runtime
	private IState gear;

	public void setGear(IState gear) {
		this.gear = gear;
	} 
	
	public int getBikeSpeed(){
		return this.gear.getSpeed();
	}

}
