package com.learning.clrs.chapter02.exercise;

import java.util.Arrays;

public class RecursiveInsertionSort {
	
	public static void sort(int[] array){
		sort(array,array.length-1);
	}
	
	private static void sort(int[] array, int end){
		if(end > 0) {
			sort(array, end-1);
			insert(array, end);
		}
		
	}
	
	private static void insert(int[] array,int endPosition){
		int index = endPosition-1;
		int key = array[endPosition];
		while(index >= 0 && array[index] > key){
			array[index+1] = array[index];
			index -= 1;
		}
		array[index+1] = key;
	}

	public static void main(String[] args) {
		int[] array = {8,2,1,6,5,12,0,9};
		System.out.println("unsorted array \t\t\t: "+Arrays.toString(array));
		sort(array);
		System.out.println("sorted array \t\t\t: "+Arrays.toString(array));
	}

}
