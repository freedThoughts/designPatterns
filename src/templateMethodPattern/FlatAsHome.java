package templateMethodPattern;

public class FlatAsHome extends Home{

	@Override
	protected void buildWalls() {
		System.out.println(" Building walls for Flat");
		
	}

	@Override
	protected void paintHome() {
		System.out.println(" Painting Flat ");
		
	}

	@Override
	protected void addAssetsAtHome() {
		System.out.println(" Adding asset - Furnitures, bed, almira in Flat");
	}

}
