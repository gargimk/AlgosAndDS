package ArraysAndString;

import java.util.Arrays;

/*
 * LEETCODE 565
 * A zero-indexed array A consisting of N different integers is given. The array contains all integers in the range [0, N - 1].
Sets S[K] for 0 <= K < N are defined as follows:
S[K] = { A[K], A[A[K]], A[A[A[K]]], ... }.
Sets S[K] are finite for each K and should NOT contain duplicates.
Write a function that given an array A consisting of N integers, return the size of the largest set S[K] for this array.*/

public class ArrayNesting {
	private static int arrayNesting(int[] nums) {

		boolean[] visited = new boolean[nums.length];
		int max = Integer.MIN_VALUE;
		int count = 0;
		int i;
		for (int j = 0; j < nums.length; j++) {
			count = 1;
			i=j;
			visited[i] = true;
			while (visited[nums[i]] == false) {
				visited[nums[i]] = true;
				i=nums[i];
				count++;

			}
			if (max < count)
				max = count;

		}
		return max;

	}

	public static void main(String args[]) {
		System.out.println(arrayNesting(new int[] { 5, 4, 0, 3, 1, 6, 2 }));
	}
}
