/**
 * 
 */
package org.ramanuj.algorithm.insertionsort;

import java.util.logging.Logger;

/**
 * @author Ramanuj Srivastava
 *
 */
public class InsertionSort {

	private final static Logger logger = Logger.getLogger(InsertionSort.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Insertion sort");

		int[] A = { 5, 2, 4, 6, 1, 3 };

		System.out.print("Unsorted List : ");
		for (int item : A)
			System.out.print(item + " ");

		int sortedArray[] = new InsertionSort().sort(A);

		System.out.print("\nSorted List   : ");
		for (int item : sortedArray)
			System.out.print(item + " ");
	}

	/**
	 * This method will sort the given array using insertion sort
	 * 
	 * @param A
	 * @return int[]
	 */
	public int[] sort(int[] A) {

		/**
		 * Starting with the second element of the array as key
		 */
		for (int i = 1; i < A.length; i++) {
			int key = A[i];

			// start with an element on the left
			int j = i - 1;

			// iterate all elements on the left of the key [0..i-1]
			// break if you find an element on the left that is smaller than key. it means
			// that is place where you need to insert the key
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}

			// since A[j] is smaller than key, we should update key on A[j+1]
			A[j + 1] = key;
		}

		return A;
	}

}
