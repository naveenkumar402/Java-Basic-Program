package bitlabs;

public class PerfectNumber1to500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=500;a++) {
			int sum=0;
			for(int i=1;i<=a/2;i++) {
				if(a%i==0) sum+=i;
			}
			if(sum==a) System.out.println(a);
		}

	}

}
