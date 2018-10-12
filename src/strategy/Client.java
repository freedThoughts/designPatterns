package strategy;

public class Client {

	public static void main(String[] args) {
		int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
		
		// We have two Strategy - Algorithms
		IStrategy evenStrategy = new EvenStrategy();
		IStrategy oddStrategy = new OddStrategy();
		
		//An algorithm should be selected and exchanged at run-time - by Client here
		//A class delegates an algorithm to a strategy object at run-time instead of implementing an algorithm directly 
		//(that is, instead of committing to an algorithm at compile-time).
		Operation operation = new Operation(oddStrategy);

		
		System.out.println(operation.getValues(arr));
	}

}
