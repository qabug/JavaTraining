package JavaBasics;

public class DataTypes {

	//main() method->starting and execution point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;

		int b =  20;
		
		System.out.println("Value of 'a' before swap:"+a);
		
		System.out.println("Value of 'b' before swap:"+b);
		
		a = a + b;
		
		b = a - b;

		a = a - b;
		
		System.out.println("Value of 'a' after swap:"+a);
		
		System.out.println("Value of 'b' after swap:"+b);
		
		int i = 10;
		
		while(i<=50) {
			System.out.println(i);
			
			i+=10;
		}
		
		System.out.println("Value of 'j'");
		for(int j=1;j<=5;j++) {
			System.out.println(j);
		}
		System.out.println("Value of 'k'");
		
		for(int k=10;k >= 1;k--) {
			System.out.println(k);
		}
		
	}

}
