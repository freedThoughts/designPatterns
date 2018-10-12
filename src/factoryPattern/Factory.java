package factoryPattern;

public class Factory {
	
	// Responsible to instantiate required Version Class
	public ProductA getProduct(String version){
		if(version.equalsIgnoreCase("1"))
			return (ProductA) new Version_1();
		else if(version.equalsIgnoreCase("2"))
			return (ProductA) new Version_2();
		else if(version.equalsIgnoreCase("3"))
			return (ProductA) new Version_3();
		
		return null;
	}

}
