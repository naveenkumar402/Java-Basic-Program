package bitlabs;

import java.util.Scanner;

public class Numberofdiv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		while(a!=0) {
			int rem=a%10;
			if(rem%5==0) count++;
			a/=10;
		}
		System.out.println(count);

	}

}
