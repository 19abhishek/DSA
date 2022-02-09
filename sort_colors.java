package coding;

public class sort_colors {
	
	public void sortColors(int[] nums) {
        int n = nums.length, left = 0, mid = 0, right = n-1;
        while(mid<=right) {
        	if(nums[mid] == 1) {
        		mid++;
        	}else if (nums[mid] == 0) {
    			int x = nums[mid];
    			nums[mid] = nums[left];
    			nums[left] = x;
    			mid++;
    			left++;
        	}else {
        		int x = nums[right];
        		nums[right] = nums[mid];
        		nums[mid] = x;
        		right--;
        	}
        	
        }
    }

	public static void main(String[] args) {
		

	}

}
