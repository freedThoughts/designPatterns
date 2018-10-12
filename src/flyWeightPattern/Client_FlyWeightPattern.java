package flyWeightPattern;

import java.util.Random;

public class Client_FlyWeightPattern {
	
	// Possible intrinsic values - anciiCodes
	// Unique intrinsic value for unique object
	private static String[] anciiCodes = new String[]{
			"1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008", "1009", "1010"
			};
	
	private static String getRandomAnciiCode(){
		return anciiCodes[new Random().nextInt(anciiCodes.length)];
	}

	public static void main(String atrg[]){
		FlyWeight object = FlyWeightFactory.getFlyWeight(getRandomAnciiCode());
		
		// Extrinsic value passed as argument to perform specific operation
		object.operation("nextParagraph");
	}

}
