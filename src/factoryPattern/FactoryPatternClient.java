package factoryPattern;

public class FactoryPatternClient {

	public static void main(String[] args) {
		Factory factory = new Factory();
		ProductA product = factory.getProduct("1");
		product.getProductFeatures("1");
		
		ProductA produ = factory.getProduct("2");
		produ.getProductFeatures("2");
		
		ProductA pro = factory.getProduct("3");
		pro.getProductFeatures("3");

	}

}
