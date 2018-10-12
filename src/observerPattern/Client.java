package observerPattern;

public class Client {
	public static void main(String [] arg){
		Observer_MemberCountryWTO India = new DevelopedAndDevelopingCountryWTO("India");
		Observer_MemberCountryWTO US = new DevelopedAndDevelopingCountryWTO("US");
		Observer_MemberCountryWTO UK = new DevelopedAndDevelopingCountryWTO("UK");
		Observer_MemberCountryWTO Germany = new DevelopedAndDevelopingCountryWTO("Germany");

		Observer_MemberCountryWTO Uganda = new UnderDevelopedCountryWTO("Uganda");
		Observer_MemberCountryWTO Afganisthan = new UnderDevelopedCountryWTO("Afganisthan");
		Observer_MemberCountryWTO Mynamar = new UnderDevelopedCountryWTO("Mynamar");

		Subject_WorldTradeOrganisation WTO = new WTO_Update();
		WTO.registerCountry(India);
		WTO.registerCountry(US);
		WTO.registerCountry(UK);
		WTO.registerCountry(Germany);
		WTO.registerCountry(Uganda);
		WTO.registerCountry(Afganisthan);
		WTO.registerCountry(Mynamar);
		
		if(India.isPolicyChanged())
			India.getUpdate();
		
		WTO.policyUpdate(MemberType.DEVELOPED_DEVELOPING, "New Trade rates changed");
		
		if(India.isPolicyChanged())
			System.out.println(India.getCountryName() + " : " + India.getUpdate());
		
		
		WTO.policyUpdate(MemberType.DEVELOPED_DEVELOPING, " Pollution control");
		
		if(India.isPolicyChanged())
			System.out.println(India.getCountryName() + " : " + India.getUpdate());
		
		System.out.println();
		
		WTO.deregisterCountry(India);
		WTO.policyUpdate(MemberType.DEVELOPED_DEVELOPING, " new changes after removig India");
		System.out.println(India.getCountryName() + " : " + India.getUpdate());
		
		if(US.isPolicyChanged())
			System.out.println(US.getCountryName() + " : " + US.getUpdate());

		System.out.println(Uganda.getCountryName() + " : " + Uganda.getUpdate());
		System.out.println(Afganisthan.getCountryName() + " : " + Afganisthan.getUpdate());
		
		
		
	}

}
