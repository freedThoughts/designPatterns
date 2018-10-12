package templateMethodPattern;

public class BangalowAsHome extends Home{

	@Override
	protected void buildWalls() {
		System.out.println(" Building Walls for Bangalow");
	}

	@Override
	protected void paintHome() {
		System.out.println(" Paining Bangalow ");
	}

	@Override
	protected void addAssetsAtHome() {
		System.out.println(" Adding asset - Furnitures for Bangalow");
	}

}
