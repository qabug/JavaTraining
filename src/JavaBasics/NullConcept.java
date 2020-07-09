package JavaBasics;

public class NullConcept {

	//null is case sensitive. All keywords are case sensitive;
	
	static Object obj;
	
	public static void sum() {
		System.out.println("Sum----- method");
	}
	
	public void send() {
		System.out.println("Send----- method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//by default any calss reference will be null
		//System.out.println(obj);
		
		
		//Integer i = null;//accepted Here Integer is a class.
		//int j=i;//Not allowed. Null value cannot be assigned to Primitive Data type int
		
		
		//instanceof keyword
		
		Integer i =null;
		Integer j=10;
		
	
		System.out.println(j instanceof Integer);// as j has reference to value, accepted
		System.out.println(i instanceof Integer);//not accepted as its pointing to null.
		
		
		
		NullConcept nc = null;
		//nc.send();//Null pointer exception as send is not Static
		nc.sum();//Static method can be accessed by null object
		
		//==  and != . null can be compared with null
		System.out.println(null == null);
		System.out.println(null != null);
		
		// null usage in String. No operation can be performed 
		
		String str=null;
		Integer i1=null;
		Double d1=null;
		String s1 = (String)null;
		System.out.println(s1);
		System.out.println(s1+"123");
		System.out.println(s1.length());// will throw Null pointer exception
		
		Integer i2 = (Integer)null;
		
		Double d2 = (Double)null;
	}
	
	
	

}
