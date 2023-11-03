package bitlabs;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int even=0,odd=0;
		while(a!=0) {
			int rem=a%10;
			if(a%2==0) even++;
			else odd++;
			a/=10;
		}
		System.out.println("Even:"+even+"\nOdd:"+odd);

	}

}
