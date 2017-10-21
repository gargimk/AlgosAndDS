package Misc;

public class PrintReverseNums {
	
	private static int printReverseNums(int n){
		
		if(n==0) return 0;
		System.out.println(n); 
		return printReverseNums(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printReverseNums(10);
	}

}
