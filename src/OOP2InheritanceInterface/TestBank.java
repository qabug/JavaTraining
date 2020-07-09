package OOP2InheritanceInterface;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("Static variable defined in interface %d\n",USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transfer();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//Dynamic Polymorphism: Top casting
		//Child class object can be referred by parent interface reference var
		
		USBank usb = new HSBCBank();
		
		System.out.println("***********Dynamic Polymorphism**********");
		usb.credit();
		usb.debit();
		usb.transfer();
		
		
	}

}
