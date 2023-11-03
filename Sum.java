package bitlabs;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a!=0) {
			int rem=a%10;  //take the last digit and store in rem
			sum+=rem;  // add the rem to sum
			a=a/10; //remove the last digit
		}
		System.out.println(sum);

	}

}
