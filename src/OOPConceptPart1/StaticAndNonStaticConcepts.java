package OOPConceptPart1;

/**
 * @author cmallikarjunap
 *
 */
public class StaticAndNonStaticConcepts {
	
	String name = "tom";//non static global var
	static int age = 25;//static global var
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Static methods can be called via Direct calling or using a classname.
		sum();//direct calling
		
		StaticAndNonStaticConcepts.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcepts.age);
		
		//Calling Non-static methods and vars
		StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
		obj.sendMail();
		System.out.println(obj.name);
		
		//calling static method via Object reference : yes, but not a good practice
		obj.sum();
		
	
	}

	public void sendMail() {
		System.out.println("Non Static Method: send an email method");
		
	}
	
	public static void  sum() {
		System.out.println("Static Method: Sum Method");
	}
	
	
	
}
