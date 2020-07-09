package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created with name obj referring to Functionsinjava class
		//after obj creation , a copy of all non static methods will be given to this this object
		
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int z = obj.division(10, 5);
		System.out.println(z);
		
	}
	//non static method
	//method returning void  
	public void test() {
		System.out.println("test method");
		
	}
	
	//method returning int value
	public int pqr() {
		System.out.println("PQR Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//Method with string output
	
	public String qa() {
		System.out.println("qa Method");
		
		String s = "Selenium";
		
		return s;
	}
	
	//x & y are input arguments
	//division returning int type
	public int division(int x, int y) {
		System.out.println("Division Output");
		
		int d= x/y;
		
		return d;
		
		
	}
}
