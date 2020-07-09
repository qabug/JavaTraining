package OOP3Abstraction;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;

	//At least one method need to exist which is abstract. Abstract method means only prototype no body
	//abstract class can have abstract and non-abstract methods
	//loan() is callesd partial abstraction
	//Abstraction: Hiding implementing knowledge
	//Cannot create object of abstract classes
	
	public abstract void loan();//Abstract method which has no body
	
	
	//Non-abstract methods
	public void credit() {
		System.out.println("Bank--->Credit");
	}
	
	
	public void debit() {
		System.out.println("Bank--->Debit");
	}
	
	
	
	
	
	
	
	
	
	
	
}
