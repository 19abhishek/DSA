package coding;

import java.util.*;

public class merge_sorted_array {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0, j = 0;
        while(i<m) {
        	if(nums1[i]>nums2[j]) {
        		int x = nums1[i];
        		nums1[i] = nums2[j];
        		nums2[j] = x;
        		
        	}else if(nums1[i] == 0) {
        		nums1[i] = nums2[j];
        		
        		j++;
        	}
        	i++;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
