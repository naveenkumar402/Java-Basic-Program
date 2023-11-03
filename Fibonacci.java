package bitlabs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n0=0;
		int n1=1;
		System.out.print(n0+" "+n1);
		for(int i=2;i<a;i++) {
			int n2=n0+n1;
			System.out.print(" "+n2);
			n0=n1;
			n1=n2;
		}
		

	}

}
