package coding;

import java.util.*;

public class pow_x_n {
	
	public double myPow(double x, int n) {
		double ans = 1;
		long val = Math.abs((long)n);
		while(val>0) {
			if((val&1) == 1) {
				ans *= x;
			}
			val = val>>1;
			x *= x;
		}
		return n>0?ans:1/ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
