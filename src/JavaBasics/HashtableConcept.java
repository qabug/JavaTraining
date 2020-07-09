package JavaBasics;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h = new Hashtable();
		
		h.put("a", "Test");
		h.put("b", "Hello");
		h.put("c", "World");
		
		System.out.println(h.size());
		
		h.put(1,  100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("c"));
		
		h.put(3,"Tom");
		System.out.println(h.get(3));
		
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		
		h1.put(1,100);
		h1.put(2,200);
		

		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		
		h2.put(1,"Good");
		System.out.println(h2.get(1));
		
	}

}
