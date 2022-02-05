package coding;

import java.util.*;

public class pascals_triangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i =1;i<=numRows;i++) {
        	List<Integer> cl = new ArrayList<>();
        	for(int j = 0; j < i; j++) {
        		if(j == 0 || j == i-1) {
        			cl.add(1);
        		}else {
        			List<Integer> pl = al.get(i-2);
        			cl.add(pl.get(j-1)+pl.get(j));
        		}
        	}
        	al.add(cl);
        }
        return al;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
