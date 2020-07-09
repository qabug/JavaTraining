package JavaInterviewQ;

import java.util.Scanner;

public class FindStringPalindrome {

	 static void stringReverse(String str) {
	
		StringBuilder newstr =  new StringBuilder();
		
		newstr.append(str);
		
		newstr = newstr.reverse();
		
		System.out.println("Reversed String is :" + newstr);
	}
	
	 static boolean isStringPalindrome(String str) {
		 
		 int i=0;
		 int j=str.length()-1;
		 
		 while (i<j) {
			 if(str.charAt(i) != str.charAt(j))
				 return false;
			 i++;
			 j--;
		 }
		 return true;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Scanner sc = new Scanner(System.in)){
		
		System.out.print("Enter a String to reverse:");
		String input = sc.nextLine();
		
		stringReverse(input);
		
		if (isStringPalindrome(input)) {
			System.out.println("Entered String is **" + input +" ** is Palindrome");
		}
		else {
			System.out.println("Entered String is **" + input +" ** is Not a Palindrome");
			}
		}	
	}
}
