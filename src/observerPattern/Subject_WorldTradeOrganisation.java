package observerPattern;

import java.util.List;

public interface Subject_WorldTradeOrganisation {
	
	void registerCountry(Observer_MemberCountryWTO memberCountry);
	void deregisterCountry(Observer_MemberCountryWTO memberCountry);
	
	void policyUpdate(MemberType memberType,String policy);
	void notify(List<Observer_MemberCountryWTO> memberCountries, String policy);
	
	List<Observer_MemberCountryWTO> getDevelopedAndDevelopingCountries();

	List<Observer_MemberCountryWTO> getUnderDevelopedCountries();

}
