package OOP2InheritanceInterface;

public class HSBCBank implements USBank, BrazilBank{//here we are achieving Multiple inheritance. this is also called Is-a relationship

	
	//if a class is implementing any interface, then its mandatory to define/override all methods of interface.
	//these methods are from US Bank
	public void credit() {
		System.out.println("HSBBC---Credit");
	}
	
	public void debit() {
		System.out.println("HSBC---Debit");
	}
	
	public void transfer() {
		System.out.println("HSBC---- Transfer");
	}
	//these methods are HSBC Bank
	public void educationLoan() {
		System.out.println("HSBC---Education Loan");
		
	}
	
	public void carLoan() {
		System.out.println("HSBC---Car Loan");
		
	}

	//these methods are from Brazilbank
	public void mutualFund() {
		System.out.println("HSBC---Brazil bank Mutual Fund");
	}
	
}
