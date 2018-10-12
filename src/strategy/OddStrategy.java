package strategy;

import java.util.ArrayList;
import java.util.List;

public class OddStrategy implements IStrategy{

	@Override
	public List<Integer> getValuesPerStategy(int[] values) {
		List<Integer> oddValues = new ArrayList<Integer>();
		for(Integer value : values){
			if(value % 2 != 0)
				oddValues.add(value);
		}
		return oddValues;
	}

}
