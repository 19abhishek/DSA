package coding;

import java.util.*;

public class find_missing_and_repeating_number {
	
	public int[] findTwoElement(int arr[], int n) {
		HashSet<Integer> set = new HashSet<>();
		int sum = 0, rep = 0;
		for(int i =0;i<arr.length;i++) {
		    int x = arr[i];
			sum+=arr[i];
			if(!set.contains(x)) {
				set.add(x);
			}else {
				rep = x;
			}
		}
		int non = 0;
		for(int i =1;i<=arr.length;i++) {
			if(!set.contains(i)) {
				non = i;
				break;
			}
		}
		return new int[]{rep, non};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
