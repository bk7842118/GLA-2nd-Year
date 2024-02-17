package lec1;

public class generate_parentheses {

	public static void main(String[] args) {
	int n=3;
	String ans="";
	generate(n,0,0,ans);

	}
	public static void generate(int n,int open,int close,String ans) {
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		if(open<n) {
			generate(n,open+1,close,ans+"(");
		}
		if(close<open) {
			generate(n,open,close+1,ans+")");
		}
	}

}
