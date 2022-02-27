package coding;

import java.util.*;

public class binary_search {
	
	public static int binarySearch(int[] arr, int x) {
		int n = arr.length;
		int low = 0, high = n-1;
		int mid = low + (high - low)/2;
		while(low<=high) {
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid]>x) {
				high = mid -1;
			}else {
				low = mid+1;
			}
			mid = low + (high - low)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
