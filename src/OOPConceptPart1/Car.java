package OOPConceptPart1;

public class Car {
	
	//Class Variables;
	
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Car() is the object of Car Class
		//"new" keyword is used to create object
		//a,b,c are object reference variable

		Car a = new Car();
	
		Car b = new Car();
		
		Car c = new Car();
		
		a.mod = 2020;
		a.wheel = 4;
		
		b.mod = 2015;
		b.wheel = 4;
		
		c.mod = 2010;
		c.wheel = 4;
		//Before assigning the references
		
		System.out.println("Before assigning the referneces");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After assigning the referneces");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		
		c.mod=20;
		System.out.println(a.mod);
		
		System.out.println(c.mod);		
		
	}

}
