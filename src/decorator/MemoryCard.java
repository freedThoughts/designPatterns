package decorator;

public class MemoryCard extends Decorator{
	private final int cost = 1000;
	
	MemoryCard(ISmartPhone smartPhone){
		super(smartPhone);
	}
	
	@Override
	public String getFeature() {
		return super.getFeature().concat(" + ").concat(" MemoryCard ");
	}

	@Override
	public int getCost() {
		return super.getCost() + this.cost;

	}
}
