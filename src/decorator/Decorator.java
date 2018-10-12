package decorator;

public class Decorator implements ISmartPhone{
	
	private ISmartPhone smartPhone;
	
	Decorator(ISmartPhone smartPhone){
		this.smartPhone = smartPhone;
	}

	@Override
	public String getFeature() {
		return smartPhone.getFeature();
	}

	@Override
	public int getCost() {
		return smartPhone.getCost();
	}

}
