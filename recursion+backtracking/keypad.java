package lec1;

public class keypad {
	static String d[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		keypad("23","");

	}
	public static void keypad(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=s.charAt(0);
		String p=d[ch-'0'];
		for(int i=0;i<p.length();i++) {
			keypad(s.substring(1),ans+p.charAt(i));
		}
	}
}
