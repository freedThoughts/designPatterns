package decorator;

public class BasicSmartPhone implements ISmartPhone{
	
	private final int cost = 5000;

	@Override
	public String getFeature() {
		return " Basic features ";
	}

	@Override
	public int getCost() {
		return this.cost;
	}


}
