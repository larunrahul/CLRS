package com.learning.clrs.chapter04;

import java.util.Arrays;

public class MaxSubArrayBruteForce {

	public static int[] maxSubArray(int[] array) {
		int maxSum = 0;
		int first = 0;
		int last = -1;
		for (int i = 0; i < array.length; i++) {
			int cSum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				cSum += array[j];
				if (cSum > maxSum) {
					maxSum = cSum;
					first = i;
					last = j;
				}
			}
		}
		return new int[] { first, last, maxSum };
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })));
	}
}
