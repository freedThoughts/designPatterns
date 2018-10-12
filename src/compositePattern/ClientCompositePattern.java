package compositePattern;


// Client requires to set officeLocation hierarchy
public class ClientCompositePattern {
	
	public static void main(String arg[]){
		
		Component CEO = new Composite();
		Component VerticalHead1 = new Composite();
		Component VerticalHead2 = new Composite();
		
		Component manager = new Composite();
		
		Component developer_1 = new Leaf();
		Component developer_2 = new Leaf();
		Component developer_3 = new Leaf();
		Component developer_4 = new Leaf();
		
		// tree structures to represent part-whole hierarchies.
		((Composite)CEO).addChild(VerticalHead1);
		((Composite)CEO).addChild(VerticalHead2);
		((Composite)VerticalHead1).addChild(manager);
		((Composite)manager).addChild(developer_1);
		((Composite)manager).addChild(developer_2);
		((Composite)VerticalHead2).addChild(developer_3);
		((Composite)VerticalHead2).addChild(developer_4);
		
		// Test 
		((Composite)CEO).setOfficeLocation("Bangalore");
		
		System.out.println("CEO Location : " + CEO.getOfficeLocation());
		System.out.println("VerticalHead1 Location : " + VerticalHead1.getOfficeLocation());
		System.out.println("VerticalHead2 Location : " + VerticalHead2.getOfficeLocation());
		System.out.println("manager Location : " + manager.getOfficeLocation());
		System.out.println("developer_1 Location : " + developer_1.getOfficeLocation());
		System.out.println("developer_2 Location : " + developer_2.getOfficeLocation());
		System.out.println("developer_3 Location : " + developer_3.getOfficeLocation());
		System.out.println("developer_4 Location : " + developer_4.getOfficeLocation());
		
		
		// Test 2 
		((Composite)CEO).setOfficeLocation("London");
		
		System.out.println("Test 2");
		System.out.println("CEO Location : " + CEO.getOfficeLocation());
		System.out.println("VerticalHead1 Location : " + VerticalHead1.getOfficeLocation());
		System.out.println("VerticalHead2 Location : " + VerticalHead2.getOfficeLocation());
		System.out.println("manager Location : " + manager.getOfficeLocation());
		System.out.println("developer_1 Location : " + developer_1.getOfficeLocation());
		System.out.println("developer_2 Location : " + developer_2.getOfficeLocation());
		System.out.println("developer_3 Location : " + developer_3.getOfficeLocation());
		System.out.println("developer_4 Location : " + developer_4.getOfficeLocation());
		
		// Test 3
		((Composite)CEO).clearChildren();
		
		System.out.println("Test 3 -  CEO have no childern");
		System.out.println("CEO Location : " + CEO.getOfficeLocation());
		System.out.println("VerticalHead1 Location : " + VerticalHead1.getOfficeLocation());
		System.out.println("VerticalHead2 Location : " + VerticalHead2.getOfficeLocation());
		System.out.println("manager Location : " + manager.getOfficeLocation());
		System.out.println("developer_1 Location : " + developer_1.getOfficeLocation());
		System.out.println("developer_2 Location : " + developer_2.getOfficeLocation());
		System.out.println("developer_3 Location : " + developer_3.getOfficeLocation());
		System.out.println("developer_4 Location : " + developer_4.getOfficeLocation());
		
		
	}
	

}
