package abstractFactoryPattern;

import abstractFactoryPattern.ProductA.ProductA;
import abstractFactoryPattern.ProductB.ProductB;
import abstractFactoryPattern.ProductC.ProductC;
import abstractFactoryPattern.ProductC.ProductC_Version_1;
import abstractFactoryPattern.ProductC.ProductC_Version_2;
import abstractFactoryPattern.ProductC.ProductC_Version_3;

public class Factory_ProductC extends AbstractFactory{

	@Override
	public ProductA getProductA(String product, String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductB getProductB(String product, String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductC getProductC(String product, String version) {
		if(version.equalsIgnoreCase("1"))
			return (ProductC) new ProductC_Version_1();
		else if(version.equalsIgnoreCase("2"))
			return (ProductC) new ProductC_Version_2();
		else if(version.equalsIgnoreCase("3"))
			return (ProductC) new ProductC_Version_3();
		
		return null;
	}


}
