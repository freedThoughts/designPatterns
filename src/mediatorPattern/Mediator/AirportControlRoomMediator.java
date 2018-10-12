package mediatorPattern.Mediator;

import java.util.HashMap;
import java.util.Map;

import mediatorPattern.Colleague.Flight;

//Define a separate (mediator) object that encapsulates the interaction between a set of objects.
public class AirportControlRoomMediator implements Mediator{
	
	Map<String, Flight> runwayToFightMap = new HashMap<String, Flight>();
	
	public AirportControlRoomMediator(){
		runwayToFightMap.put("RUNWAY_1", null);
		runwayToFightMap.put("RUNWAY_2", null);
		runwayToFightMap.put("RUNWAY_3", null);
		runwayToFightMap.put("RUNWAY_4", null);
		runwayToFightMap.put("RUNWAY_5", null);
	}

	@Override
	public void allocateMeARunway(Flight flight) {
		for(Map.Entry<String, Flight> entry : runwayToFightMap.entrySet()){
			if(entry.getValue() == null){
				runwayToFightMap.put((String) entry.getKey(), flight);
				makeAnnouncement(flight.getFlightName() + " landing on runway " + entry.getKey());
				return;
			}
		}
		System.out.println(" No Free Runway for " + flight.getFlightName());
		freeRunWayForIncommingFlight();
	}

	@Override
	public void freeMyRunway(Flight flight) {
		for(Map.Entry<String, Flight> entry : runwayToFightMap.entrySet()){
			if(entry.getValue() == flight){
				runwayToFightMap.put(entry.getKey(), null);
				makeAnnouncement(" Flight " + flight.getFlightName() + " departed from runway " + entry.getKey());
				return;
			}
		}
		System.out.println(" No runway freed for " + flight.getFlightName());
	}
	
	private void makeAnnouncement(String announcement){
		System.out.println("ANNOUNCEMENT :- " + announcement);
	}
	
	private void freeRunWayForIncommingFlight(){
		for(Map.Entry<String, Flight> entry : runwayToFightMap.entrySet()){
			if(entry.getValue() != null){
				System.out.println(" Announcement For " + entry.getValue().getFlightName()
						+ " : Please free your runway. Incomming flight is waiting ");
			}
		}
	}

}
