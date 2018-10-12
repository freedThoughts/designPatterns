package immutable;

public class Department implements Cloneable{
	
	int depId;
	String depName;
	
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	public Department(int id, String name){
		this.depId = id;
		this.depName = name;
	}
	
	@Override
	public Object clone(){
		int id = this.depId;
		String name = this.depName;
		return new Department(id, name);
	}


}
