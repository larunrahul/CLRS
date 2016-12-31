package com.learning.clrs.chapter02.exercise;

import java.util.ArrayList;
import java.util.List;

public class SubSetSumWithTwoElements {
	
	public static List<Integer> subsetWithSum(int[] array, int sum){
		List<Integer> result = new ArrayList<>();
		List<Integer> intermediate = new ArrayList<>();
		for(int i = 0; i < array.length; i++){
			if(intermediate.contains(sum - array[i])){
				result.add(array[i]);
				result.add(sum - array[i]);
				return result;
			}
			intermediate.add(array[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(subsetWithSum(new int[]{3,5,6,8}, 9).toString());
	}

}
