package OOP2InheritanceInterface;

public class TestCar {

	public static void main(String[] args) {
		
		//Static polymorphism or Compile time polymorphism
		
		System.out.println("static polymorphism");
		System.out.println("*******************");
		BMW b= new BMW();
		b.start();//When parent and child class has same method, preference is given to method in Child Class
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("*******************");
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*******************");
		
		System.out.println("Dynamic polymorphism");
		System.out.println("*******************");
		
		
		//Child Class object can be referred by parent class reference variable: called as Dynamic or Run time Polymorphism
		//Also called Top casting
		Car c1 = new BMW();
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting. 
		
		BMW b1 = (BMW)new Car();//ClassCastException is throwed
		
		
	}

}
