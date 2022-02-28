package coding;
import java.util.*;
public class largest_subarray_with_0_sum {
	
	public int maxLen(int arr[], int n)
    {
		HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0; 
        for(int i = 0;i<n;i++) {
            sum += arr[i]; 
            if(sum == 0) {
                maxi = i + 1; 
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {

                    mpp.put(sum, i); 
                }
            }
        }
        return maxi;
    }

	public static void main(String[] args) {
		

	}

}
