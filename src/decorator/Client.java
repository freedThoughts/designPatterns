package decorator;

public class Client {

	public static void main(String[] args) {
		
/*		 All the below objects created, are kept as type of common Interface ISmartPhone
		 All object constructor takes argument of type ISmartPhone Interface
		 Actual type of object will be resolved at runtime. This is how we can achieve runtime bounding.*/
		
		ISmartPhone basicSmartPhone =  new BasicSmartPhone();
		ISmartPhone frontCamera =  new FrontCamera(basicSmartPhone);
		System.out.println("SmartPhone Features :- " + frontCamera.getFeature());
		System.out.println("SmartPhone Costs :- " + frontCamera.getCost());
		
		// Responsibilities should be added to (and removed from) an object dynamically at run-time.
		// Features are added incrementally

		ISmartPhone rearCamera = new RearCamera(frontCamera);
		ISmartPhone memoryCard = new MemoryCard(rearCamera);
		ISmartPhone headSet = new HeadSet(memoryCard);
		ISmartPhone extendedWarranty = new ExtendedWarranty(headSet);
		
		
		
		
		ISmartPhone finalProductReady = extendedWarranty;
		//ISmartPhone finalProductReady = headSet;
		//ISmartPhone finalProductReady = memoryCard;
		
		System.out.println("SmartPhone Features :- " + finalProductReady.getFeature());
		System.out.println("SmartPhone Costs :- " + finalProductReady.getCost());
		
	}

}

// With every creation of DecoratedImplementationObject, Decorator class object will be created.
// Number of decorator class of object is equals to number of decoratedImplementationObject created.
// Decorator object is used to hold the value calculated till that object through process of chaining object inside constructor parameters.
