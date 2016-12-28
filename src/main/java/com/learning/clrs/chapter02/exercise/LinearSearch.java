package com.learning.clrs.chapter02.exercise;

/**
 * Simple linear search algorithm
 * @author rahul
 *
 */
public class LinearSearch {
	
	public static int search(int[] array, int element){
		for(int i = 0; i < array.length; i++){
			if(array[i] == element){
				return i+1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Element is present at position: "+search(new int[]{4,1,7,3,5,9,2},3));
	}

}
