package Misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Given a digit string, return all possible letter combinations that the number could represent. 
public class LetterCombinationsInPhone {
	
	static String[] map = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String args[]){
		
		List<String> listI= letterCombinationInPhoneNumberIterative("234");
		List<String> listR= letterCombinationInPhoneNumberRecursive("234");
		for(String s:listI){
			System.out.print(s+", ");
		}
		System.out.println();
		for(String s:listR){
			System.out.print(s+", ");
		}
	}
	
	public static List<String> letterCombinationInPhoneNumberIterative(String digits){
		List<String> ans = new ArrayList<>();
		if(digits.isEmpty()) return ans;
		ans.add("");
		for(int i=0;i<digits.length();i++){
			//int x= Character.getNumericValue(digits.charAt(i));
			//String letters = map[x];
			String letters = map[digits.charAt(i)-'0'];
			while(ans.get(0).length()==i){
				String s = ans.remove(0);
				for(Character ch : letters.toCharArray()){
					ans.add(s+ch);
				}
			}
		}
		
		return ans;
		
	}
	
	public static List<String> letterCombinationInPhoneNumberRecursive(String digits){
		List<String> ans = new ArrayList<>();
		helper(ans,digits,"",0);
		return ans;
		
	}
	private static void helper(List<String> ans,String digits,String str,int index){
		
		if(index>=digits.length()){
			ans.add(str);
			return;
		}
		
			String letters = map[digits.charAt(index)-'0'];
			for(Character ch : letters.toCharArray()){
				helper(ans,digits,str+ch,index+1);
		}
	}
}
