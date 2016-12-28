package com.learning.clrs.chapter02.exercise;

import java.util.Arrays;

/**
 * Implementation of Insertion sort to sort in descending order
 * @author rahul
 *
 */
public class DescendingInsertionSort {
	
	/**
	 * Descending sort
	 */
	public static void reverseSort(int[] array){
		for(int index = 1; index < array.length; index++){
			int key = array[index];
			int sortedIndex = index-1; 
			while(sortedIndex >= 0 && key > array[sortedIndex]){
				array[sortedIndex+1] = array[sortedIndex];
				sortedIndex-= 1;
			}
			array[sortedIndex+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,5,2,37,3,1,7,4,9,6,10};
		System.out.println("unsorted array \t\t\t: "+Arrays.toString(array));
		reverseSort(array);
		System.out.println("descendingly sorted array \t: "+Arrays.toString(array));
	}
}
