package JavaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Qa bug exception");//personalized exception and catching it 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PWRRR");
		
		
		String Exec_flag= "N";
		if (Exec_flag.equals("N")) {
			try {
			throw new Exception ("Throw New exception");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		
		
	}

}
