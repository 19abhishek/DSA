package coding;

import java.util.*;

public class buy_sell_stock {
	
	
	//checking maximum on the right side
	
	public int maxProfit(int[] prices) {
		int n = prices.length;
        int max[] = new int[n];
        max[n-1] = prices[n-1];
        for(int i =n-2;i>=0;i--) {
        	max[i] = Math.max(max[i+1], prices[i]);
        }
        int ans = 0;
        for(int i =0;i<n-1;i++) {
        	ans = Math.max(ans, max[i+1]-prices[i]);
        }
        return ans;
    }

	
	//checking minimum on the left side
	
	static int maxProfit2(int[] arr) {
	    int maxPro = 0;
	    int minPrice = Integer.MAX_VALUE;
	    for (int i = 0; i < arr.length; i++) {
	      minPrice = Math.min(minPrice, arr[i]);
	      maxPro = Math.max(maxPro, arr[i] - minPrice);
	    }
	    return maxPro;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
