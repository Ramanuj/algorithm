/**
 * 
 */
package org.ramanuj.algorithm.insertionsort;

import java.util.logging.Logger;

import org.ramanuj.algorithm.util.AppUtil;

/**
 * This class sorts a given array using insertion sort and displays the result
 * 
 * @author Ramanuj Srivastava
 *
 */
public class InsertionSort {

	private final static Logger logger = Logger.getLogger(InsertionSort.class.getName());

	/**
	 * Start the execution of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Insertion sort");

		int[] inputArray = { 5, 2, 4, 6, 1, 3 };

		System.out.print("Unsorted List : ");
		AppUtil.printArray(inputArray);

		int sortedArrayAsc[] = new InsertionSort().sort(inputArray, true);

		System.out.print("\nSorted List Ascending Order   : ");
		AppUtil.printArray(sortedArrayAsc);

		int sortedArrayDesc[] = new InsertionSort().sort(inputArray, false);
		System.out.print("\nSorted List Descending Order  : ");
		AppUtil.printArray(sortedArrayDesc);

	}

	/**
	 * This method will sort the given array using insertion sort
	 * 
	 * @param A
	 * @return int[]
	 */
	public int[] sort(int[] A, boolean ascending) {

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
			while (j >= 0 && (ascending == true ? A[j] > key : A[j] < key)) {
				A[j + 1] = A[j];
				j--;
			}

			// since A[j] is smaller than key, we should update key on A[j+1]
			A[j + 1] = key;
		}

		return A;
	}

}
