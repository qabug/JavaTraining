package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "100";
		System.out.println(x+20);//as x is a string, it will add 20 padded at the end of 100.
		
		
		//data conversion: converting string to Integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		//data conversion: converting string to Double
		String y = "12.33";
		
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//no method for converting string to Char 
		
		
		//data conversion: converting string to Boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		
		System.out.println(b);
		
		//data conversion: converting int to string
		
		int j = 200;
		
		System.out.printf("before converting to string %d",j+20);
		
		String s = String.valueOf(j);
		
		System.out.printf("\nAfter converting to string %s",s+20);


	}

}
