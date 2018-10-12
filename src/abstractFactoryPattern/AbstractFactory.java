package abstractFactoryPattern;

import abstractFactoryPattern.ProductA.ProductA;
import abstractFactoryPattern.ProductB.ProductB;
import abstractFactoryPattern.ProductC.ProductC;

public abstract class AbstractFactory {
	public abstract ProductA getProductA(String product, String version);
	public abstract ProductB getProductB(String product, String version);
	public abstract ProductC getProductC(String product, String version);
}
