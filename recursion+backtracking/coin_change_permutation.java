package lec1;

import java.util.ArrayList;
import java.util.List;

public class coin_change_permutation {

	public static void main(String[] args) {
		int coin[]= {2,3,5};
		int amount=8;
		List<List<Integer>>ll=new ArrayList<>();
		List<Integer> l=new ArrayList<Integer>();
		coin_change(coin,amount,l,ll);
		System.out.print(ll);

	}
	public static void coin_change(int coin[],int amount,List<Integer>l,List<List<Integer>>ll) {
		if(amount==0) {
//			System.out.println(l);
			ll.add(new ArrayList<>(l));
			return;
		}
		if(amount<0) {
			return;
		}
		for(int i=0;i<coin.length;i++) {
			l.add(coin[i]);
			coin_change(coin,amount-coin[i],l,ll);
			l.remove(l.size()-1);//backtrack
		}
	}

}
