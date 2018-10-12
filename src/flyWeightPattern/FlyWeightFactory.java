package flyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	
	// Shared map - Key is build on all intrinsic variables. 
	//In our case, we have only one intrinsic variable - anciiCode
	private static final Map<String, FlyWeight> sharedMap = new HashMap<String, FlyWeight>();
	
	public static FlyWeight getFlyWeight(String anciiCode){
		FlyWeight object = sharedMap.get(anciiCode);
		
		if(object == null){
			object = new FlyWeightImpl(anciiCode);
			sharedMap.put(anciiCode, object);
		}
		
		return object;
	}

}
