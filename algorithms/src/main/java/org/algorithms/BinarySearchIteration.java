package org.algorithms;

public class BinarySearchIteration {
	public static int search(int[] source, int start, int end, int data) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (source[mid] == data) {
				return mid;
			} else if (source[mid] > data) {
				end = mid - 1;
			} else if (source[mid] < data) {
				start = mid + 1;
			}
		}
		return -1;
	}
}
