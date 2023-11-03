package bitlabs;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int alpha=0;
		int num=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int a=(int)ch;
			if(a>=65 && a<=90) alpha++;
			else if (a>=97 && a<=122) alpha++;
			else num++;
		}
		System.out.println("Alphabet:"+alpha+"\nNumbers:"+num);

	}

}
