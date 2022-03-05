package coding;

import java.util.*;

public class coin_change {
	
	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
        int n = coins.length;
        int i = n-1, count = 0;
        while(i>=0 && amount>=0) {
        	if((amount/coins[i])>0) {
        		count += (amount/coins[i]);
        	}
        	amount = amount % coins[i];
        	i--;
        }
        if(amount == 0) {
        	return count;
        }
        return -1;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
