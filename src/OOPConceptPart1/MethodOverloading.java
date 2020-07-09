package OOPConceptPart1;

/**
 * @author cmallikarjunap
 *
 */
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,11);
	}

	public void sum() {
		System.out.println("SUM Method-->zero param");
	}
	
	public void sum(int i) {
		System.out.println("Sum Method-->1 param");
		System.out.println(i);
	}
	
	public void sum(int k, int n) {
		System.out.println("Sum Method--> Two param");
		System.out.println(k+n);
	}
	
}
