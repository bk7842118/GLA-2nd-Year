package lec1;

public class factorial_q {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n));

	}
	public static int fac(int n) {
//		base case
		if(n==0) {
			return 1;
		}
//		recursive call
		int x=fac(n-1);
//		small calculation
		return x*n;
	}

}
