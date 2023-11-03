package bitlabs;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int hcf=0;
		int i=1;
		while(i<=a || i<=b) {
			if(a%i==0 && b%i==0) hcf=i;
		}
		System.out.println(hcf);

	}

}
