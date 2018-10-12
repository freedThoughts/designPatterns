package protoTypePattern;

import java.util.ArrayList;
import java.util.List;


public class Employee implements Cloneable{
	
	private List<String> employees;
	
	Employee(){
		employees = new ArrayList<String>();
	}
	
	public void loadData(){
		employees.add("Praksh");
		employees.add("Rakesh");
		employees.add("Prasant");
	}
	
	public void showEmployee(){
		for(String employee : employees)
			System.out.print(employee + ",  ");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Employee temp = new Employee();
		
		for(String employee : this.employees)
			temp.employees.add(employee);

		return temp;
	}



}
