package flyWeightPattern;

public class FlyWeightImpl implements FlyWeight{
	
	// intrinsic (invariant) state that can be shared - make the Object unique
	String anciiCode;
	
	
	// extrinsic (variant) state can be passed in by client
	String positionToWrite;
	
	
	
	public FlyWeightImpl(String anciiCode){
		this.anciiCode = anciiCode;
		this.positionToWrite = null;
	}
	

	@Override
	public void operation(String positionToWrite) {
		
		// Different operations can be performed based on extrinsic variable - positionToWrite
		if(positionToWrite.equals("NextParagraph"))
			System.out.println("Add FlyWeight object in next paragraph");
		else if(positionToWrite.equals("NextLine"))
			System.out.println("Add FlyWeight object in next Line");
		else if(positionToWrite.equals(" Continue in same line "))
			System.out.println(" Add FlyWeight object in same line ");
	
	}

}
