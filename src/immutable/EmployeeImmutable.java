package immutable;

import java.util.ArrayList;
import java.util.List;

final public class EmployeeImmutable {
	
	private final int empId;
	private final String empName;
	private final ArrayList<String> clients;   // We are using ArrayList for declaration - Not List - We needed implemented class - not interface.
										       // clone() method is not available with interface - It's available with implemented class
	
	private final ArrayList<Department> departments;
	
	// No Setters -- Only Getters
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public ArrayList getClients() {
		return (ArrayList<String>)clients.clone();  // No need for Deep cloning as String is already a immutable Class
	}
	
	public ArrayList<Department> getDepartments() {
		
		// Deep Cloning
		ArrayList<Department> dep = new ArrayList<Department>();
		for(Department d : this.departments)
			dep.add((Department)d.clone());
		
		return dep;
	}

	
	public EmployeeImmutable(int empId, String empName, List clients, List<Department> departme){
		this.empId = empId;
		this.empName = empName;
		
		// Performing deep cloning
		List<String> newClients = new ArrayList<String>();
		newClients.addAll(clients);
		this.clients = (ArrayList<String>) newClients;
		
		
		// Deep cloning for Departments
		ArrayList<Department> dep = new ArrayList<Department>();
		for(Department d : departme)
			dep.add((Department)d.clone());
		this.departments = dep;

	}
}
