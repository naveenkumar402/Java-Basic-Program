package bitlabs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		System.out.println("Display even numbers");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				even++;
			}
			else odd++;
		}
		System.out.println("\n\nNumber of even and odd numbers");
		System.out.println("Even:"+even+"\nOdd:"+odd);
		System.out.println("\n\nDivisible by 5");
		div();

	}
	static void div() {
		for(int i=1;i<=50;i++) {
			if(i%5==0) System.out.print(i+" ");
		}
	}
	

}
