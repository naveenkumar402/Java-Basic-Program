package bitlabs;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n<=100;n++) {
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) sum+=i;
			}
			if(sum==n) System.out.println(n);
			
		}
		

	}

}
