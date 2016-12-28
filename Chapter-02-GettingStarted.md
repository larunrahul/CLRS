#Chapter 02 - Getting Started
**2.1-2** : Rewrite the INSERTION-SORT procedure to sort into nonincreasing instead of non-decreasing order.

**Answer:** [Code](https://github.com/larunrahul/CLRS/blob/master/src/main/java/com/learning/clrs/chapter02/exercise/DescendingInsertionSort.java)

**2.1-3** : Linear Search and its loop invariant

**Answer:** [Code](https://github.com/larunrahul/CLRS/blob/master/src/main/java/com/learning/clrs/chapter02/exercise/LinearSearch.java)

Loop invariant : Array elements from index 0 to j will not contain our search element. Elements from j+1 to k-1 where k is length of array, may contain our search element

Initialization : j is 0, hence true

Maintenance : 0 < j < k-1 where k is length of array will not contain our element. If it contains, we would have returned by now and we would not be in current iteration. Elements from j+1 to k may contain our element which we don't know yet. Hence true

Termination : If loop is terminated without returning, then we didn't find our element in array which means we could not find the element in 0 to k-1 elements. Hence true.
