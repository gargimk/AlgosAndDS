package ArraysAndString;

import java.util.ArrayList;
import java.util.List;

/* 
 * LEETCODE 386
 * Given an integer n, return 1 - n in lexicographical order.
For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9]. */


public class LexicographicalNumbers {
	
	private static List<Integer> lexicographicalNums(int n){
		
		if(n==0) return new ArrayList<Integer>();
		List<Integer> result = new ArrayList<>();
		for(int i=1;i<10;i++){
			helper(i,result,n);
		}
		return result;
		
	}
	private static void helper(int num, List<Integer> list, int n){
		if(num>n) return;
		
		list.add(num);
		for(int i=0;i<10;i++){
			if(num*10+i>n) return;
			helper(num*10+i,list,n);
		}
		
	}
	
	public static void main(String args[]){
		
		List<Integer> answer = lexicographicalNums(13);
		for(Integer i:answer){
			System.out.print(i+" ");
		}
		
	}

}
