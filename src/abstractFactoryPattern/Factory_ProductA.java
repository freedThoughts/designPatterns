package abstractFactoryPattern;

import abstractFactoryPattern.ProductA.ProductA;
import abstractFactoryPattern.ProductA.ProductA_Version_1;
import abstractFactoryPattern.ProductA.ProductA_Version_2;
import abstractFactoryPattern.ProductA.ProductA_Version_3;
import abstractFactoryPattern.ProductB.ProductB;
import abstractFactoryPattern.ProductC.ProductC;

public class Factory_ProductA extends AbstractFactory{

	@Override
	public ProductA getProductA(String product, String version) {
		if(version.equalsIgnoreCase("1"))
			return (ProductA) new ProductA_Version_1();
		else if(version.equalsIgnoreCase("2"))
			return (ProductA) new ProductA_Version_2();
		else if(version.equalsIgnoreCase("3"))
			return (ProductA) new ProductA_Version_3();
		
		return null;
	}

	@Override
	public ProductB getProductB(String product, String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductC getProductC(String product, String version) {
		// TODO Auto-generated method stub
		return null;
	}

}
