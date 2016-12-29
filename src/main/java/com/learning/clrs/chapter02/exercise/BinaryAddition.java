package com.learning.clrs.chapter02.exercise;

import java.util.Arrays;

/**
 * Addition of two binary numbers represented in two arrays
 * a[n] + b[m] = k[max(n,m)+1] (+1 is for carry)
 * @author rahul
 *
 */
public class BinaryAddition {
	
	/*
	 * This works even if arrays are of different/same size 
	 * It doesn't use extra space, parses only once, never does array copying
	 * Complexity : O(max(n,m)) where n and m are sizes of respective arrays
	 * Also, it parses only once.
	 */
	public static int[] add(int[] first, int[] second){
		int[] small = first.length < second.length ? first : second;
		int[] big = first.length >= second.length ? first : second;
		int[] result = new int[big.length+1];
		int carry = 0, bigCounter = big.length-1;
		// Iterates from end of array to the size of smallest of arrays
		for(int smallCounter = small.length-1; smallCounter >= 0; smallCounter--,bigCounter--){
			// XOR = boolean Addition(+) - in other words a(+)b(+)c = a+b+c where a,b and c are single bits
			result[bigCounter+1] =  small[smallCounter] ^ big[bigCounter] ^ carry; 
			
			// carry(a+b+c) = (a&b)|(b&c)|(c&a)
			carry = (small[smallCounter] &  big[bigCounter]) | (big[bigCounter] & carry) | (carry & small[smallCounter]);
		}
		
		// Iterates remaining elements in big array
		for( ;bigCounter >= 0; bigCounter--){
			// XOR = boolean Addition(+) - in other words a(+)b = a+b where a,b are single bits
			result[bigCounter+1] =  big[bigCounter] ^ carry;
			
			// carry(a+b) = (a&b)
			carry = big[bigCounter] & carry;
		}
		
		result[bigCounter+1] = carry;
		return result;
	}

	public static void main(String[] args) {
		int[] a = {1,1,0,1};
		int[] b = {1,0,1,0,1,1};
		System.out.println(Arrays.toString(add(a,b)));
		int[] c = {1,0,1,1};
		System.out.println(Arrays.toString(add(a,c)));

	}

}
