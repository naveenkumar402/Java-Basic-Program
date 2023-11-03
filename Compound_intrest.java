package bitlabs;

import java.util.Scanner;

public class Compound_intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Principle amount:");
		int p=sc.nextInt();
		System.out.println("Rate of intrest:");
		int r=sc.nextInt();
		System.out.println("No.of.years:");
		int y=sc.nextInt();
		int ci=0;
		for(int i=0;i<y;i++) {
			int a=p*r*y/100;
			ci=ci+a;
			p=p+a;
		}
		System.out.println(ci);

	}

}
