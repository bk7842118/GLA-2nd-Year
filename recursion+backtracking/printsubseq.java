package lec1;

public class printsubseq {

	public static void main(String[] args) {
		String s="abc";
		String ans="";
		subseq(s,ans);

	}
	public static void subseq(String s,String ans) {
		//base case
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=s.charAt(0);
		//recursive call
		subseq(s.substring(1),ans+ch);
		subseq(s.substring(1),ans);
		
	}

}
