package factoryPattern;

public class Version_2 implements ProductA{
	
	@Override
	public void getProductFeatures(String version) {
		System.out.println("Product A : Version " + version);
		
	}
}
