package lec1;

public class coin_Toss {

	public static void main(String[] args) {
		String ans="";
		System.out.println(coinchange(3,ans));

	}
	public static int coinchange(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		int x=coinchange(n-1,ans+"H");
		int y=coinchange(n-1,ans+"T");
		return x+y;
	
	}

}
