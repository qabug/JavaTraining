package OOPConceptPart1;

public class VariablesLocalGlobal {

	//global variables
	
	String name = "Tom";
	int age = 25;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//local variable i local to main
		int i = 10;
		System.out.println(i);
		
		VariablesLocalGlobal var = new VariablesLocalGlobal();
		System.out.println(var.name);
	
		System.out.println(var.age);
		
	}

	public void sum() {
		//local variable i local to sum method
		
		int i = 15;
		int j = 20;

		

	}
	
}