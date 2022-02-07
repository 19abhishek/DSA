package coding;

import java.util.*;

public class next_permutation {
	
	public void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
		if(index == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for(int i =0;i<nums.length;i++) {
				ds.add(nums[i]);
			}
			ans.add(new ArrayList<Integer>(ds));
			return;
		}
		for(int i = index;i<nums.length;i++) {
			swap(i, index, nums);
			recurPermute(index+1, nums, ans);
			swap(i, index, nums);
		}
	}
	
	public void swap (int i, int j, int[] nums) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
	
	public void nextPermutation(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
