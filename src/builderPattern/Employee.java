package builderPattern;

public class Employee {
	
	//Mandatory variables 
	int id;
	String name;
	
	// Optional Variables
	String department;
	String location;
	
	private Employee(EmployeeBuilder builder){
		this.id = builder.id;
		this.name = builder.name;
		this.department = builder.department;
		this.location = builder.location;
	}
	
	//Builder Class
	// class is static because we like to access EmployeeBuilder class before creation of it's parent object.
	// Static variables can be accessed without object and default values are set -- Only for variables
	public static class EmployeeBuilder{
		
		//Mandatory variables 
		public int id;
		String name;
		
		// Optional Variables
		String department;
		String location;
		
		public EmployeeBuilder setDepartment(String department) {
			this.department = department;
			return this;
		}
	
	
		public EmployeeBuilder setLocation(String location) {
			this.location = location;
			return this;
		}

		// Constructor with mandatory parameter
		public EmployeeBuilder(int id, String name){
			this.id = id;
			this.name = name;
		}
		
		public Employee build(){
			return new Employee(this);
		}

		
	}

}
