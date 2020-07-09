package OOP2InheritanceInterface;

public class BMW extends Car { //has-a relationship
	
	//When same method is present in parent and child class with same name and same number of arguments, its called method overriding
	public void start() {
		System.out.println("BMW Start Method");
	}
	
	public void theftSafety() {
		
		System.out.println("BMW TheftSafety method");
	}
	
}
