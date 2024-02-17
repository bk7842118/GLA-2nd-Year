package lec1;

public class first_occurence {

	public static void main(String[] args) {
	   int []arr= {10,30,50,40,30,70};
	   int t=50;
	   System.out.println(fo(arr,0,t));

	}
	public static int fo(int []arr,int idx,int t) {
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==t) {
			return idx;
		}
		return fo(arr,idx+1,t);
	}

}
