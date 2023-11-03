package bitlabs;



public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {
			int res=0;
			int n=i;
			while(n!=0) {
				int rem=n%10; //take last digit of the number
				res+=(rem*rem*rem); //add the cube of last digit
				n=n/10; // remove the last digit and check the while condition
			}
			if(res==i) System.out.println(res); //if sum of cube of all numbers equal to given number
			
		}

	}

}
