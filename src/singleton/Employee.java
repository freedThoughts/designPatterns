package singleton;

public class Employee {
	
	private static Employee instance;
	
	private Employee(){} // Private constructor restrict creation of object through Sub-class OR from external sources
	
	public static synchronized Employee getInstance(){
		if(instance == null){
			synchronized(Employee.class){
				if(instance == null)
					instance = new Employee();
			}
		}
			
		return instance;
	} 
}
