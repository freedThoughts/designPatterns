package bridgePattern.implementation;

public class DecorateHome implements WorkNeedToBeDoneAtHome{

	@Override
	public void executeWork() {
		System.out.println(" Decorate Home ");
	}
}
