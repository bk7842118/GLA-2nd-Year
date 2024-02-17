package lec1;

public class pow {

	public static void main(String[] args) {
		System.out.println(pow1(3,4));

	}
	public static int pow1(int a,int b) {
		if(b==0) {
			return 1;
		}
		int x=pow1(a,b-1);
		return a*x;
	}
}
