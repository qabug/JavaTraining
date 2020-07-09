package JavaBasics;

public class ConstructorThisKeyword {
	//Class Var
	String name;
	int age;	
	
	public ConstructorThisKeyword(String name, int age) {
		//to initialize global variable to local variable, this keyword is used
		this.name=name;
		this.age=age;
		
	
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorThisKeyword obj = new ConstructorThisKeyword("Chaitra", 40);

	}

}
