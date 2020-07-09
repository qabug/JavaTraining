package JavaInterviewQ;

import java.util.Scanner;

public class FactorialNumber {

	//factorial number:
	//for ex: factorial of 3= 3*2*1
	
	//without recursive using for loop
	
	public static int fact(int num) {
		
		int f=1;
		
		if(num == 0)
			return 1;
		
		for (int i=1;i<=num; i++) {
			f=f*i;
		}
		return f;
	}	
	
	//with recursive: a function which calls itself
	
	public static int rfact(int num) {
		if(num == 0)
			return 1;
		else
			return(num * rfact(num-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the Number to verify Factorial: ");
		int input= sc.nextInt();
		
		System.out.println("Factorial using Non recursive logic is: " +fact(input));
		
		System.out.print("Factorial using recursive logic is: " +rfact(input));
	}

}
