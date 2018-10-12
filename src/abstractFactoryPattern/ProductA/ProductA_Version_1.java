package abstractFactoryPattern.ProductA;

public class ProductA_Version_1 implements ProductA{

	@Override
	public void getProductFeatures(String version) {
		System.out.println("Product A: Version :- " + version);
	}

}
