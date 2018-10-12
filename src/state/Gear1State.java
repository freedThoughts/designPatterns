package state;

public class Gear1State implements IState {

	final int speed = 10;
	@Override
	public int getSpeed() {
		return this.speed; 
	}

}
