package decorator;

public class ExtendedWarranty extends Decorator{
	private final int cost = 2000;
	
	ExtendedWarranty(ISmartPhone smartPhone){
		super(smartPhone);
	}
	
	@Override
	public String getFeature() {
		return super.getFeature().concat(" + ").concat(" ExtendedWarranty ");
	}

	@Override
	public int getCost() {
		return super.getCost() + this.cost;

	}
}
