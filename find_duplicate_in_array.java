package coding;

import java.util.*;

public class find_duplicate_in_array {
	
	public int findDuplicate(int[] arr) {
		int n = arr.length;
		Set<Integer> set = new HashSet<>();
//        int freq[] = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            if(set.contains(arr[i])) {
//            	return arr[i];
//            }else {
//            	set.add(arr[i]);
//            }
//        }
        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
