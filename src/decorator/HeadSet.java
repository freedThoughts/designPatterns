package decorator;

public class HeadSet extends Decorator{
	
	private final int cost = 500;
	
	HeadSet(ISmartPhone smartPhone){
		super(smartPhone);
	}
	
	@Override
	public String getFeature() {
		return super.getFeature().concat(" + ").concat(" HeadSet ");
	}

	@Override
	public int getCost() {
		return super.getCost() + this.cost;

	}
}
