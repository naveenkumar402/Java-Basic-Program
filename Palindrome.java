package bitlabs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=a;
		int rev=0;
		while(n!=0) {  //if a=0 loop exit
			int rem=n%10;  //take last digit of number
			rev=rem+(rev*10); //store the number
			n=n/10;  //remove the last digit
		}
		
		if(rev==a) System.out.println("palindrme");
		else System.out.println("Not palindrome");
	}

}

