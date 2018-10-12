package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WTO_Update implements Subject_WorldTradeOrganisation{
	
	List<Observer_MemberCountryWTO> developedAndDevelopingCountries = new ArrayList<Observer_MemberCountryWTO>();
	List<Observer_MemberCountryWTO> underDevelopedCountries = new ArrayList<Observer_MemberCountryWTO>();
	
	public List<Observer_MemberCountryWTO> getDevelopedAndDevelopingCountries() {
		return developedAndDevelopingCountries;
	}
	public void setDevelopedAndDevelopingCountries(
			List<Observer_MemberCountryWTO> developedAndDevelopingCountries) {
		this.developedAndDevelopingCountries = developedAndDevelopingCountries;
	}
	public List<Observer_MemberCountryWTO> getUnderDevelopedCountries() {
		return underDevelopedCountries;
	}
	public void setUnderDevelopedCountries(
			List<Observer_MemberCountryWTO> underDevelopedCountries) {
		this.underDevelopedCountries = underDevelopedCountries;
	}

	
	@Override
	public void registerCountry(Observer_MemberCountryWTO memberCountry) {
		if(memberCountry instanceof DevelopedAndDevelopingCountryWTO)
			developedAndDevelopingCountries.add(memberCountry);
		 else if(memberCountry instanceof UnderDevelopedCountryWTO)
			 underDevelopedCountries.add(memberCountry);
		
	}
	@Override
	public void deregisterCountry(Observer_MemberCountryWTO memberCountry) {
		if(memberCountry instanceof DevelopedAndDevelopingCountryWTO)
			developedAndDevelopingCountries.remove(memberCountry);
		 else if(memberCountry instanceof UnderDevelopedCountryWTO)
			 underDevelopedCountries.remove(memberCountry);
		
	}
	@Override
	public void policyUpdate(MemberType memberType, String policy) {
		
		//All the observers are notified by subject in a single event call as Broadcast communication
		if(MemberType.UNDERDEVELOPED.equals(memberType))
			notify(underDevelopedCountries, policy);
			
		else if(MemberType.DEVELOPED_DEVELOPING.equals(memberType))
			notify(developedAndDevelopingCountries, policy);
		
	}
	@Override
	public void notify(List<Observer_MemberCountryWTO> memberCountries, String policy) {
		for(Observer_MemberCountryWTO country : memberCountries){
			country.setUpdate( (country.getUpdate()!= null ? country.getUpdate()+ ". \n " : "") 
																+ policy);
			System.out.println("Broadcast Message for :- " + country.getCountryName() + 
					". Check new policy changes on your portal.");
		}
			
		
	}


}
