package bitlabs;

import java.util.Scanner;

public class NumberofDigitsinInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		int count=0;
		while(a!=0) {
			count++; //increase the count value if a not equal to zero
			a=a/10;  //remove the last digit
		 
		}
		System.out.println(count);


	}

}
