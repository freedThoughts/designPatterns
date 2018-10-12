package abstractFactoryPattern;

public class FactoryProducer {

	public static AbstractFactory getProduct(String product){
		if(product.equalsIgnoreCase("A"))
			return (AbstractFactory) new Factory_ProductA();
		else if(product.equalsIgnoreCase("B"))
			return (AbstractFactory) new Factory_ProductB();
		else if(product.equalsIgnoreCase("C"))
			return (AbstractFactory) new Factory_ProductC();
		
		return null;
	}
}
