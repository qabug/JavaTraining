package JavaInterviewQ;

import java.util.Scanner;

public class FindArmstrongNumber {

	//what is Armstrong Number:
	//cube of every digit and sum of all the numbers= Armstrong number
	//123= (1*1*1)+(2*2*2)+(3*3*3)= 36 so not an Armstrong number
	//153=(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153 this is a Armstrong number
	 
	public static void isArmstrongNumber(int num) {
		int cube=0;
		int r;
		int tmp= num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
		if (tmp == cube) {
			System.out.println("This is Armstrong Number");
		}else {
			System.out.println("This is Not an Armstrong Number");
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the Number to verify whether its a Armstrong Number: ");
		int input= sc.nextInt();
		
		isArmstrongNumber(input);
	}
}
