package abstractFactoryPattern.ProductC;

public class ProductC_Version_1 implements ProductC{
	@Override
	public void getProductFeatures(String version) {
		System.out.println("Product C: Version :- " + version);
	}
}
