package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
	
	private String officeLocation;
	private List<Component> children = new ArrayList<Component>();
	
	public List<Component> getChildren() {
		return children;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}
	
	
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
		
		// Composite objects forward the request to their child components recursively downwards the tree structure. 
		for(Component child : children)
			child.setOfficeLocation(officeLocation);
	}
	
	public void addChild(Component child){
		this.children.add(child);
	}
	
	public void removeChild(Component child){
		
		// Composite objects forward the request to their child components recursively downwards the tree structure. 
		child.setOfficeLocation(null);
		
		children.remove(child);
	}

	public void clearChildren(){
		
		// Composite objects forward the request to their child components recursively downwards the tree structure.
		for(Component child : children)
			child.setOfficeLocation(null);
		
		this.children.clear();
	}

}
