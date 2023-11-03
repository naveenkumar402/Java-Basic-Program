package bitlabs;

import java.util.Scanner;

public class Swap_Third_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		System.out.println("Before Swapping:"+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:"+a+" "+b);

	}

}
