package bridgePattern.abstraction;

import java.util.List;

import bridgePattern.implementation.WorkNeedToBeDoneAtHome;

// Client Facing - Client directly calls 
public abstract class Home {
	
	public abstract void getMeAHome();
	
	protected List<WorkNeedToBeDoneAtHome> works;
	
	protected Home(List<WorkNeedToBeDoneAtHome> works){
		this.works = works;
	}
}
