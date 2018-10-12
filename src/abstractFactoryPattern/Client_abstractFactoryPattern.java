package abstractFactoryPattern;

import abstractFactoryPattern.ProductA.ProductA;
import abstractFactoryPattern.ProductB.ProductB;
import abstractFactoryPattern.ProductC.ProductC;

public class Client_abstractFactoryPattern {
		
	public static void main(String[] args) {
		Object object = null; 
		String product = "D"; 
		String version = "5"; 
		
		AbstractFactory factory = FactoryProducer.getProduct(product);
		
		if(product.equalsIgnoreCase("A"))
			object = factory.getProductA(product, version);
		else if(product.equalsIgnoreCase("B"))
			object = factory.getProductB(product, version);
		else if(product.equalsIgnoreCase("C"))
			object = factory.getProductC(product, version);
		
		if(object != null && product.equalsIgnoreCase("A")){
			((ProductA)object).getProductFeatures(version);
		} else if(object != null && product.equalsIgnoreCase("B")){
			((ProductB)object).getProductFeatures(version);
		} else if(object != null && product.equalsIgnoreCase("C")){
			((ProductC)object).getProductFeatures(version);
		}


	}
}
