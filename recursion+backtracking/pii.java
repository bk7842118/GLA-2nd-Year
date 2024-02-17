package lec1;

public class pii {

	public static void main(String[] args) {
		int n=5;
		pi(n);

	}
	public static void pi(int n) {
		//base case
		if(n==0) {
			return;
		}
		
		pi(n-1);
		System.out.println(n);
	}

}
