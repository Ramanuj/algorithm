/**
 * 
 */
package org.ramanuj.algorithm.util;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Ramanuj Srivastava
 *
 */
public class AppUtil {

	public static void printArray(int[] arrayToBePrinted) {

		IntStream stream = Arrays.stream(arrayToBePrinted);
		stream.forEach(x -> System.out.print(x + " "));
	}
}
