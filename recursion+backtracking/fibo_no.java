package lec1;

public class fibo_no {

	public static void main(String[] args) {
		int n=4;
		System.out.println(fibo(n));

	}
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int x=fibo(n-1);
		int y=fibo(n-2);
		return x+y;
	}

}
