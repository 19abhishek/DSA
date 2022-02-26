package coding;

import java.util.*;

public class subarray_with_given_xor {
	
	public int solve(int[] A, int B) {
	     HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>(); 
	        int c = 0; 
	        int cpx = 0;
	        int n = A.length;
	        for(int i = 0;i<n;i++) {
	            cpx = cpx ^ A[i]; 
	            if(visited.get(cpx^B) != null) 
	                c += visited.get(cpx ^ B); 
	            if(cpx == B) {
	                c++; 
	            }
	            if(visited.get(cpx) != null) 
	                visited.put(cpx, visited.get(cpx) + 1); 
	            else 
	                visited.put(cpx, 1); 
	        }
	        return c; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
