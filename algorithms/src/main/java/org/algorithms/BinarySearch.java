package org.algorithms;

public class BinarySearch {

	public static int search(int[] source,int start,int end,int data) {
		int mid=start +(end-start)/2;
		if(end>=start) {
			if(source[mid]==data) {
				return mid;
			} else if(source[mid] > data) {
				return search(source, start, mid-1, data);
			} else if(source[mid] < data) {
				return search(source, mid+1, end, data);
			}
		}
		return -1;
	}
}
