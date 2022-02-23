package coding;

import java.util.*;

public class search_in_sorted_2d_matrix {
	
	public static boolean binarySearch(int[] arr, int x) {
		int n = arr.length;
		int low = 0, high = n-1;
		int mid = low + (high - low)/2;
		while(low<=high) {
			if(arr[mid] == x) {
				return true;
			}else if(arr[mid]>x) {
				high = mid -1;
			}else {
				low = mid+1;
			}
			mid = low + (high - low)/2;
		}
		return false;
	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i =0;i<rows;i++) {
        	if(matrix[i][0]<=target && matrix[i][cols-1] >=target) {
        		return binarySearch(matrix[i], target);
        	}
        }
        return false;
    }
	
	public boolean searchMatrix1(int[][] matrix, int target) {
        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int hi = (n * m) - 1;
        
        while(lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		boolean ans = binarySearch(arr, 3);
		System.out.println(ans);

	}

}
