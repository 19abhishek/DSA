package coding;

import java.util.*;

public class remove_duplicates {
	
	public int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
