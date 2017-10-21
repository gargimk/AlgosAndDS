package ArraysAndString;

public class ReverseString {
	static StringBuilder sb = new StringBuilder();
	
	private static String reverseStrRecursive(String str){
		
		if(str.equals("")) return new String(sb);
		sb.append(str.charAt(str.length()-1));
		return reverseStrRecursive(str.substring(0,str.length()-1));
		
		/*if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);*/
		
	}

	private static String reverseStrIterative(String str){
		int s=0;
		int e=str.length()-1;
		char[] strArr = str.toCharArray();
		while(s<e){
			char temp=strArr[s];
			strArr[s]=strArr[e];
			strArr[e]=temp;
			s++;e--;
		}
		return String.valueOf(strArr);
	}
	
	public static void main(String[] args) {
		System.out.println("Recursive:" + reverseStrRecursive("String"));
		System.out.println("Iterative:" + reverseStrIterative("String"));

	}
	

}
