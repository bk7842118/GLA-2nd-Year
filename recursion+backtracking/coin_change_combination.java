package lec1;

import java.util.List;

import java.util.ArrayList;
public class coin_change_combination {

	public static void main(String[] args) {
		int coin[]= {2,3,5};
		int amount=8;
		List<List<Integer>>ll=new ArrayList<>();
		List<Integer> l=new ArrayList<Integer>();
		coin_change(coin,amount,l,0,ll);
		System.out.print(ll);

	}
	public static void coin_change(int coin[],int amount,List<Integer>l,int idx,List<List<Integer>>ll) {
		if(amount==0) {
//			System.out.println(l);
			ll.add(new ArrayList<>(l));
			return;
		}
		if(amount<0) {
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			l.add(coin[i]);
			coin_change(coin,amount-coin[i],l,i,ll);
			l.remove(l.size()-1);//backtrack
		}
	}

}
