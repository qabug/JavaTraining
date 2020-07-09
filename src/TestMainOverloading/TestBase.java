package TestMainOverloading;

public class TestBase {

	
	//JVM will search for main(String[] args)-->which is always public static void
	//main method can be overloaded
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Method-1");
		
		
		main("test");
		main(1);
		main(2,3);
	}
	
	public static void main(String args) {
		// TODO Auto-generated method stub

		System.out.println("Main Method2- with string argument");
		
	}
	
	public static void main(int a) {
		// TODO Auto-generated method stub

		System.out.println("Main Method3- with int parameter");
		
	}
	
	public static void main(int a, int b) {
		// TODO Auto-generated method stub

		System.out.println("Main Method4- with two int parameter");
		
	}


}
