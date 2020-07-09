package JavaInterviewQ;

import java.util.Scanner;

public class FindPalindrome {
	//Palindrome number is a number which is same when read from left to right or right to left
	//ex: 151,12121.1221 etc
	
	public static void isPalindrome(int num) {
		int rem = 0;
		int sum = 0;
		int tmp;
		tmp=num;
		
		while (num>0) {
			rem = num % 10;//to get the reminder
			sum =  (sum *10)+rem;//Multiple by sum with 10 and add with rem
			num = num / 10;// device num by 10
			
		}
		if (tmp== sum) {
			System.out.println(tmp + " is a Palindrome Number");
		}else {
			System.out.println(tmp + " is Not a Palindrome Number");
		}
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner  sc = new Scanner(System.in)){
		
		System.out.print("Enter the Number to verify whether its a Palindrome Number: ");
		int input = sc.nextInt();	
		isPalindrome(input);
		}
	}

}
