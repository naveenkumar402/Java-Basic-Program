package bitlabs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int c=1;c<=100;c++) {
			if(c<2) System.out.println("Niether prime nor composite");
			int flag=0;
			int i=2;
			while(i<=c/2) {
				if(c%i==0) flag++;
				i++;
			}
			if(flag==0) System.out.println(c);
			
			
		}

	}

}
