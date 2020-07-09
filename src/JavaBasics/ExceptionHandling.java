package JavaBasics;

public class ExceptionHandling {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//example of uncaught exception		
	//	int i = 9/0;
	//	System.out.println(i);
		
		
		//Caught exception
		
		//Thread.sleep(2000);
		
		//How to catch Exceptions
		//1. try- catch block
		//used to report exception
		
		try{
			int i=9/0;//exception will be thrown
		}catch(Throwable e) {// can use "Exception" keyword as well for generic exceptions
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("ABC");
		 
		
		
	}

}
