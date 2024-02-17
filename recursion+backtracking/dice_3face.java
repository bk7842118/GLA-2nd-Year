package lec1;

public class dice_3face {

	public static void main(String[] args) {
		int sp=0;
		int ep=6;
		String ans="";
		System.out.println(dice(sp,ep,ans));

	}
	public static int dice(int sp,int ep,String ans) {
		if(sp==ep) {
			System.out.println(ans);
			return 1;
		}
		if(sp>ep) {
			return 0;
		}
//		dice(sp+1,ep,ans+1);
//		dice(sp+2,ep,ans+2);
//		dice(sp+3,ep,ans+3);
		int count=0;
		for (int i=1;i<=6;i++) {
			count=count+dice(sp+i,ep,ans+i);
		}
		return count;
	}

}
