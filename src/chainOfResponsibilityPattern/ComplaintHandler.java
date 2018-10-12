package chainOfResponsibilityPattern;

import java.util.Random;

public abstract class ComplaintHandler {
	
	private ComplaintHandler nextLevelComplaintHandler;
	
	public ComplaintHandler getNextLevelComplaintHandler() {
		return nextLevelComplaintHandler;
	}

	public void setNextLevelComplaintHandler(ComplaintHandler nextLevelComplaintHandler){
		this.nextLevelComplaintHandler = nextLevelComplaintHandler;
	} 
	
	public abstract void solveComplaint(CustomerComplaint complaint);
	
	
	// Actual boolean values should be project specific - based on complaint processing units
	protected boolean isTimeEscalated(){
		return new Random().nextBoolean();
	}

}
