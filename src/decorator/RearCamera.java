package decorator;

public class RearCamera extends Decorator{
	
	private final int cost = 3000;
	
	RearCamera(ISmartPhone smartPhone){
		super(smartPhone);
	}
	
	@Override
	public String getFeature() {
		return super.getFeature().concat(" + ").concat(" RearCamera ");
	}

	@Override
	public int getCost() {
		return super.getCost() + this.cost;

	}
}
