package JavaBasics;

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsKeyword obj = new ThrowsKeyword();
		
		obj.sum();
		
		
	}
	
	
	public void sum(){
		try {
		div();
		}catch(ArithmeticException e) {
			
		}
	}
	
	
	public void div() throws ArithmeticException {
		
		int i =9/0;//exception is thrown  here
		
	}

}
