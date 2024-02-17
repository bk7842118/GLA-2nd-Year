package lec1;

public class lexico_counting {

	public static void main(String[] args) {
		int n=1000;
		lexico(n,0);
	}
	public static void lexico(int n,int curr) {
		//base case
		if(curr>n) {
			return;
		}
		int i=0;
		System.out.println(curr);
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			lexico(n,curr*10+i);
		}
	}

}
