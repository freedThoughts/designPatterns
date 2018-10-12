package observerPattern;

public class UnderDevelopedCountryWTO implements Observer_MemberCountryWTO{
	private String countryName;
	private String update;
	private boolean isPolicyChanged;

	public boolean isPolicyChanged() {
		return isPolicyChanged;
	}

	public void setPolicyChanged(boolean isPolicyChanged) {
		this.isPolicyChanged = isPolicyChanged;
	}

	public String getUpdate() {
		this.setPolicyChanged(false);
		return update;
	}

	public void setUpdate(String update) {
		this.setPolicyChanged(true);
		this.update = update;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public UnderDevelopedCountryWTO(String name){
		this.countryName = name;
	}

}
