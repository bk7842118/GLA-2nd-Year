package lec1;

public class check_array_is_sorted_or_not {

	public static void main(String[] args) {
		int []arr= {10,20,40,30};
		System.out.println(sorted(arr,0));

	}
	public static boolean sorted(int []arr,int idx) {
		//base case
		if(idx==arr.length-1) {
			return true;
		}
		if(arr[idx]>arr[idx+1]) {
			return false;
		}
		//smaller problem
		boolean is_sorted=sorted(arr,idx+1);
		//calculation
		if(is_sorted) {
			return true;
		}else {
			return false;
		}
		
	}

}
