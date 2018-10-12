package mediatorPattern.Mediator;

import mediatorPattern.Colleague.Flight;

// Define a separate (mediator) object that encapsulates the interaction between a set of objects.
public interface Mediator {
	
	public void allocateMeARunway(Flight flight);
	public void freeMyRunway(Flight flight);
}
