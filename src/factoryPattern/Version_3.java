package factoryPattern;

public class Version_3 implements ProductA{

	@Override
	public void getProductFeatures(String version) {
		System.out.println(" Product A and Version : " + version);
	}

}
