package protoTypePattern;

public class ProtoTypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		employee.loadData();
		employee.showEmployee();
		System.out.println();
		
		// Need to create new Employee object 
		Employee newEmployee = (Employee) employee.clone();
		//newEmployee.employees.add("New Name");
		
		newEmployee.showEmployee();
		System.out.println();
		employee.showEmployee();
		


	}

}
