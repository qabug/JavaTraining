package JavaBasics;

import java.util.ArrayList;


public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println("********Array size after adding 3 numbers*******");
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		
		System.out.println("********Array size after adding 2 more numbers*******");
		System.out.println(ar.size());
		ar.add("TOM");
		ar.add("Good");
		ar.add(10.33);
		ar.add('C');
		System.out.println("********Array size after adding 2 more numbers*******");
		System.out.println(ar.size());
		System.out.println(ar.get(7));
		
		System.out.println(ar.size());
		ar.remove(8);
		System.out.println(ar.size());
		//to print all values of arraylist
		System.out.println("********Printing Array list*******");
		for (int j=0; j<ar.size(); j++) {			
			System.out.println(ar.get(j));
		}
		
		//to restrict adding only integers
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(2);
		
		//to add only string values;
		ArrayList<String> ar2 =  new ArrayList<String>();

		
	}
	
	

}
