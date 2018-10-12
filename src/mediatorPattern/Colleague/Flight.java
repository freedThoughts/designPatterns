package mediatorPattern.Colleague;

import mediatorPattern.Mediator.Mediator;

public abstract class Flight {
	
	protected Mediator controlRoom;
	protected String flightName;
	
	public Flight(Mediator controlRoom, String flightName){
		this.controlRoom = controlRoom;
		this.flightName = flightName;
	}
	
	public String getFlightName() {
		return flightName;
	}
	
	public abstract void allocateMeARunway();
	public abstract void freeMyRunway();

}
