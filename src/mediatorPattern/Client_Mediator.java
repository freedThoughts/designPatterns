package mediatorPattern;

import mediatorPattern.Colleague.Flight;
import mediatorPattern.Colleague.FlightColleague;
import mediatorPattern.Mediator.AirportControlRoomMediator;
import mediatorPattern.Mediator.Mediator;

public class Client_Mediator {
	public static void main(String arg[]){
		Mediator controlRoom = new AirportControlRoomMediator();
		
		Flight flight1001 = new FlightColleague(controlRoom, "flight1001");
		Flight flight1002 = new FlightColleague(controlRoom, "flight1002");
		Flight flight1003 = new FlightColleague(controlRoom, "flight1003");
		Flight flight1004 = new FlightColleague(controlRoom, "flight1004");
		Flight flight1005 = new FlightColleague(controlRoom, "flight1005");
		Flight flight1006 = new FlightColleague(controlRoom, "flight1006");
		Flight flight1007 = new FlightColleague(controlRoom, "flight1007");
		
		flight1001.allocateMeARunway();
		flight1002.allocateMeARunway();
		flight1003.allocateMeARunway();
		flight1004.allocateMeARunway();
		flight1005.allocateMeARunway();
		flight1006.allocateMeARunway();
		
		flight1001.freeMyRunway();
		flight1006.allocateMeARunway();
		flight1007.allocateMeARunway();
		flight1004.freeMyRunway();
	}

}
