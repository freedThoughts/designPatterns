package decorator;

public class FrontCamera extends Decorator{
	
	private final int cost = 2000;
	
	FrontCamera(ISmartPhone smartPhone){
		super(smartPhone);
	}
	
	@Override
	public String getFeature() {
		return super.getFeature().concat(" + ").concat(" FrontCamera ");
	}

	@Override
	public int getCost() {
		return super.getCost() + this.cost;

	}

}
