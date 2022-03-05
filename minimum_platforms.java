package coding;

import java.util.*;

public class minimum_platforms {
	
	static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platforms = 1, max = 1;
        
        int i = 1, j = 0;
        while(i<n && j<n) {
        	if(arr[i]<=dep[j]) {
        		platforms++;
        		i++;
        	}else if(dep[j]<arr[i]) {
        		platforms--;
        		j++;
        	}
        	
        	max = Math.max(platforms, max);
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
