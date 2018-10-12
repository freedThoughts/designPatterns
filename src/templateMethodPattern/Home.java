package templateMethodPattern;

public abstract class Home {
	
	boolean assetNeedToBeAdded;
	
	// Template Method - Final - controls the subClasses behavior
	protected final void getMeAHome_TemplateMethod(boolean assetNeedToBeAdded){
		this.assetNeedToBeAdded = assetNeedToBeAdded;
		
		// we can not change the order of execution fixed by parent class
		 buildFoundationPillar();
		 buildWalls();
		 paintHome();
		 
		 // Parent Class - Template method - Logic - controls subClass behavior
		 if(assetNeedToBeAdded)
			 addAssetsAtHome();
		 
	}

	
	// Final method as Client do not want this behavior to be overridden by subClasses
	// This behavior is common for all subclasses
	private final void buildFoundationPillar() {
		System.out.println(" Building foundation Pillar ");
	}
	
	protected abstract void buildWalls();
	protected abstract void paintHome();
	protected abstract void addAssetsAtHome();
}
