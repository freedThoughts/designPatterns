package bridgePattern.abstraction;

import java.util.List;

import bridgePattern.implementation.WorkNeedToBeDoneAtHome;

public class bangalowAsHome extends Home{

	public bangalowAsHome(List<WorkNeedToBeDoneAtHome> works) {
		super(works);
	}

	@Override
	public void getMeAHome() {
		System.out.println("Constructing Bangalow");
		for(WorkNeedToBeDoneAtHome work : works)
			work.executeWork();
	}

}
