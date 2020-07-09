package OOP2InheritanceInterface;

public interface USBank {

	int min_bal=100;
	
	//in interface only method name is defined not the method body. Only method declaration. 
	//There is no Main method. its abstract in nature.
	//we cannot create an object of interface
	//In interface vars can be declared, vars are by default Static in nature and value will not be changed. Only final and static var can be declared.
	//No Static method in interfaces
	
	public void credit();
	
	public void debit();
	
	public void transfer(); 
	
	
}
