package strategy;

import java.util.ArrayList;
import java.util.List;

public class EvenStrategy implements IStrategy{

	@Override
	public List<Integer> getValuesPerStategy(int[] values) {
		List<Integer> evenValues = new ArrayList<Integer>();
		for(Integer value : values){
			if(value % 2 == 0)
				evenValues.add(value);
		}
		return evenValues;
	}


}
