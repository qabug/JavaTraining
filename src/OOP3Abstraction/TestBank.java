package OOP3Abstraction;

public class TestBank {

	
	
	public static void main(String[] args) {
		
		HDFC hb = new HDFC();
		hb.credit();
		hb.loan();
		hb.debit();
		hb.funds();
		
		Bank b = new HDFC();
		b.credit();
		b.loan();
		b.debit();
	}
}
