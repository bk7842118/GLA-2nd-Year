package lec1;

public class permutation_of_string_without_repetetion{

	public static void main(String[] args) {
		String s="abca";
		String ans="";
		permutation(s,ans);

	}
	public static void permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			 boolean t=true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					t=false;
					break;
				}
			}
			if(t==true)
			{
			char ch=s.charAt(i);
			permutation(s.substring(0,i)+s.substring(i+1),ans+ch);
			}
		}
	}

}
