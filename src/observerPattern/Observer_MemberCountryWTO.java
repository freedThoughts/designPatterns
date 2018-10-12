package observerPattern;

public interface Observer_MemberCountryWTO {
	
	public String getCountryName();
	public void setCountryName(String countryName);
	public String getUpdate();
	public void setUpdate(String update);
	
	public boolean isPolicyChanged();
	public void setPolicyChanged(boolean isPolicyChanged);

}
