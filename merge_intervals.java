package coding;
import java.util.*;

public class merge_intervals {
	
	public class compareX implements Comparator<int[]> {
		public int compare(int[] a, int[] b) {
			return a[0] - b[0];
		}
	}
	
	public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new compareX());
        List<int[]> al = new ArrayList<>();
        int cval = intervals[0][0], cmax= intervals[0][1];
        for(int i =0;i<intervals.length;i++) {
        	if(intervals[i][0] > cmax) {
                int[] x = {cval,cmax};
        		al.add(x);
        		cval = intervals[i][0];
        		cmax = intervals[i][1];
        	}else {
        		cmax = Math.max(cmax, intervals[i][1]);
        	}
        }
        int l[] = {cval,cmax};
        al.add(l);
        //System.out.println(al.size());
        return al.toArray(new int[al.size()][]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
