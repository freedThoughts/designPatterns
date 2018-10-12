package builderPattern;

public class BuilderDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee.EmployeeBuilder(100, "Prakash")
					.setDepartment("ETC").setLocation("BLR").build();
		System.out.println(emp.name);
		
   

	}

}
