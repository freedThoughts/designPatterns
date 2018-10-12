package bridgePattern.abstraction;

import java.util.List;

import bridgePattern.implementation.WorkNeedToBeDoneAtHome;

public class FlatAsHome extends Home{

	public FlatAsHome(List<WorkNeedToBeDoneAtHome> works) {
		super(works);
	}

	@Override
	public void getMeAHome() {
		System.out.println("Constructing Flat");
		for(WorkNeedToBeDoneAtHome work : works)
			work.executeWork();
	}
}
