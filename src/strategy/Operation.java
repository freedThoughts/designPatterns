package strategy;

import java.util.List;

public class Operation {
	
	private IStrategy strategy;
	
	Operation(IStrategy strategy){
		this.strategy = strategy;
	}
	
	List getValues(int[] arr){
		return this.strategy.getValuesPerStategy(arr);
	}

}
