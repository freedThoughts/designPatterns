package immutable;

import java.util.ArrayList;
import java.util.List;

public class immutableDemo {

	public static void main(String[] args) {
		
		int id = 10;
		String name = "Prakash";
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("ZXC");
		list.add("QWE");
		
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(new Department(1000, "ETC"));
		departments.add(new Department(2000, "CS"));
		
		EmployeeImmutable employee = new EmployeeImmutable(id, name, list, departments);
		System.out.println(employee.getClients());
		for(Department d : employee.getDepartments())
			System.out.print(d.getDepName() + ", ");
		System.out.println();
		
		
		list.add("NEW VALUE");
		name = "NEW NAME";
		id = 20;
		departments.add(new Department(3000, "IT"));
				
		System.out.println(employee.getClients());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		for(Department d : employee.getDepartments())
			System.out.print(d.getDepName() + ", ");
		System.out.println();
		
		
		EmployeeImmutable employee2 = new EmployeeImmutable(id, name, list, departments);
		System.out.println(" Employee 2  values");
		System.out.println(employee2.getClients());
		System.out.println(employee2.getEmpId());
		System.out.println(employee2.getEmpName());
		for(Department d : employee2.getDepartments())
			System.out.print(d.getDepName());
		
		

	}

}
