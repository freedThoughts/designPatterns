package mediatorPattern.Colleague;

import mediatorPattern.Mediator.Mediator;

public class FlightColleague extends Flight{

	public FlightColleague(Mediator controlRoom, String flightName) {
		super(controlRoom, flightName);
	}

	@Override
	public void allocateMeARunway() {
		// Objects delegate their interaction to a mediator object instead of interacting with each other directly.
		this.controlRoom.allocateMeARunway(this);
	}

	@Override
	public void freeMyRunway() {
		// Objects delegate their interaction to a mediator object instead of interacting with each other directly.
		this.controlRoom.freeMyRunway(this);
	}
}
