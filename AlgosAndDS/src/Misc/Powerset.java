package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Powerset {

	public static void main(String args[]){
		int[] nums = new int[]{2,1,3};
		List<List<Integer>>resultI = generatePowersetIterative(nums);
		List<List<Integer>>resultBit = generatePowersetBitOp(nums);
		//qList<List<Integer>>resultB = generatePowersetBacktraking(nums);
		printResult(resultBit);
		
	}
	
	private static List<List<Integer>> generatePowersetIterative(int[] nums){
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		Arrays.sort(nums);
		for(int i:nums){
			List<List<Integer>> temp = new ArrayList<List<Integer>>();
			for(List<Integer> sub:res){
				List<Integer> a = new ArrayList<>(sub);
				a.add(i);
				temp.add(a);
			}
			res.addAll(temp);
		}
		
		return res;
		
	}
	
	private static List<List<Integer>> generatePowersetBitOp(int[] nums){
			List<List<Integer>> res = new ArrayList<List<Integer>>();
			int n = nums.length;
			for(int i=0;i<Math.pow(n, 2);i++){
				List<Integer> a = new ArrayList<>();
				for(int j=0;j<n;j++){
					if((i&(1<<j))>0){
						a.add(nums[j]);
					}
				}
				res.add(a);
			}
			return res;
			
		}
	
	/*private static List<List<Integer>> generatePowersetBacktraking(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		helper(res, 0,nums.length,nums);
		return res;
		
	}
	private static void helper(List<List<Integer>> res,int start, int end,int[] nums){
		List<Integer> temp = new ArrayList<Integer>();
		res.add(temp);
		if(start>end) return;
		for(int i =start;i<nums.length;i++){
			temp.add(nums[i]);
			helper(res,i+1,end,nums);
			temp.remove(i);
		}
	}*/
	
	private static void printResult(List<List<Integer>>result){
		for(List<Integer> l : result){
			for(int i:l){
				System.out.print(i);
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
