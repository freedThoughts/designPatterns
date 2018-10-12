package abstractFactoryPattern.ProductB;

public class ProductB_Version_1 implements ProductB{
	@Override
	public void getProductFeatures(String version) {
		System.out.println("Product B: Version :- " + version);
	}
}
