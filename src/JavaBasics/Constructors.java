package JavaBasics;

public class Constructors {

	//while creating the object if you want to define class features in the form of Global Variables
	
	//Constructors cannot return any value
	//Constructors name should be same as Class name
	//default constructors= Zero parameter
	
	public Constructors() {
		
		System.out.println("Default Constructor");
	}
	
	//default constructors= Single parameter
	public Constructors(int i) {
		System.out.println("Single Parameter Constructor. Value of i:" +i);
		
	}
	
	
	//default constructors= Double parameter
	public Constructors(int i, int j) {
		System.out.println("Double Parameter Constructor. Value of i, j:" +i +j);
		
	}
	
	
	public static void main(String[] args) {
	
		Constructors obj = new Constructors();		
		Constructors obj1 = new Constructors(5);		
		Constructors obj2= new Constructors(5,7);

	}

}
