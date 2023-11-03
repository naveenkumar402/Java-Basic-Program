package bitlabs;

import java.util.Scanner;

public class Simple_Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Principle amount:");
		int p=sc.nextInt();
		System.out.println("Rate of intrest:");
		int r=sc.nextInt();
		System.out.println("No.of.years:");
		int y=sc.nextInt();
		System.out.println("Simple intrest:"+(p*r*y/100));

	}

}
