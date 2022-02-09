package coding;

import java.util.*;

public class max_subarray_sum {
	
	public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for(int i =0;i<nums.length;i++) {
        	currSum += nums[i];
        	maxSum = Math.max(maxSum, currSum);
        	if(currSum<0) {
        		currSum = 0;
        	}
        }
        return maxSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
