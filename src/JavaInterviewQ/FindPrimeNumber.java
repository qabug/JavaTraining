package JavaInterviewQ;

import java.util.Scanner;

public class FindPrimeNumber {

	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			System.out.println( num + " : is Not a prime Number");
			return false;
		}
		for (int i=2; i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		System.out.println("Prime numbers until " + num + " are ");
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i))
				System.out.println(i + "  ");
		}
	}
	
	public static void main(String[] args) {
		
		//Prime Number can be divided by itself or zero
		//Edge cases or corner cases
		//2 is the lowest prime number
		
		try(Scanner sc = new Scanner(System.in)){
		
		int prime;
		System.out.print("Enter the Number to verify whether its a Prime Number: ");
		prime = sc.nextInt();
		isPrimeNumber(prime);
		getPrimeNumber(prime);
		}
		
	}
}

