package LongestIncreasingSubsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static int findLIS(int[] nums) {
		int n = nums.length;
		int[] lis = new int[n];
		Arrays.fill(lis, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}

		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			if (lis[i] > maxLength) {
				maxLength = lis[i];
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };

		int lisLength = findLIS(nums);

		System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
	}
}
