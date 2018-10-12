package bridgePattern;

import java.util.ArrayList;
import java.util.List;

import bridgePattern.abstraction.FlatAsHome;
import bridgePattern.abstraction.Home;
import bridgePattern.abstraction.bangalowAsHome;
import bridgePattern.implementation.AddAssetsAtHome;
import bridgePattern.implementation.ConstructHome;
import bridgePattern.implementation.DecorateHome;
import bridgePattern.implementation.PaintHome;
import bridgePattern.implementation.WorkNeedToBeDoneAtHome;

// Home and WorkNeedToBeDoneAtHome - Both are orthogonal class hierarchies

public class Client_BridgePattern {
	public static void main(String [] arg){
		System.out.println(" Client need a home with list of works done before delivery ");
		
		// List of works need to be done before home delivery
		List<WorkNeedToBeDoneAtHome> worksNeedToBeDoneBeforeHomeDelivery = new ArrayList<WorkNeedToBeDoneAtHome>();
		worksNeedToBeDoneBeforeHomeDelivery.add(new ConstructHome());
		worksNeedToBeDoneBeforeHomeDelivery.add(new PaintHome());
		worksNeedToBeDoneBeforeHomeDelivery.add(new DecorateHome());
		worksNeedToBeDoneBeforeHomeDelivery.add(new AddAssetsAtHome());
		
		
		List<WorkNeedToBeDoneAtHome> worksNeedToBeDoneBeforeHomeDelivery2 = new ArrayList<WorkNeedToBeDoneAtHome>();
		worksNeedToBeDoneBeforeHomeDelivery2.add(new ConstructHome());
		worksNeedToBeDoneBeforeHomeDelivery2.add(new PaintHome());
		
		
		List<WorkNeedToBeDoneAtHome> worksNeedToBeDoneBeforeHomeDelivery3 = new ArrayList<WorkNeedToBeDoneAtHome>();
		worksNeedToBeDoneBeforeHomeDelivery3.add(new ConstructHome());

		
		
/*		 worksNeedToBeDoneBeforeHomeDelivery# can be attached with 
		 anyone or both of  FlatAsHome and bangalowAsHome
		 This is the beauty of Bridge pattern */
		
		
/**  	A compile-time binding between an abstraction and its implementation should be avoided 
		so that an implementation can be selected at run-time.
		worksNeedToBeDoneBeforeHomeDelivery/#/ selected at runtime 
		   Home(List<WorkNeedToBeDoneAtHome> works)  - Constructor takes Interface as parameter 
		   interface which is common for all IMPLEMENTATION. Actual binding would be done at runtime
		   when we create object for the interface and pass to Home constructor *****/
		Home home = new FlatAsHome(worksNeedToBeDoneBeforeHomeDelivery);
		Home home2 = new FlatAsHome(worksNeedToBeDoneBeforeHomeDelivery2);
		Home home3 = new FlatAsHome(worksNeedToBeDoneBeforeHomeDelivery3);
		
/******		 We want to hide the implementation -  WorkNeedToBeDoneAtHome, from the client application.
		 So, we are not calling WorkNeedToBeDoneAtHome objects explicitly  ***/
		home.getMeAHome();
		home2.getMeAHome();
		home3.getMeAHome();
		
		
		
		Home home4 = new bangalowAsHome(worksNeedToBeDoneBeforeHomeDelivery);
		Home home5 = new bangalowAsHome(worksNeedToBeDoneBeforeHomeDelivery2);
		Home home6 = new bangalowAsHome(worksNeedToBeDoneBeforeHomeDelivery3);
		home4.getMeAHome();
		home5.getMeAHome();
		home6.getMeAHome();

	}

}
