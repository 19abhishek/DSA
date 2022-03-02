package coding;

public class rotate_matrix {
	
	public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0;i<n;i++) {
        	for(int j =i;j<m;j++) {
        		int x = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = x;
        	}
        }
        int i =0, j = m-1;
        while(i<j) {
        	for(int x=0;x<n;x++) {
        		int val = matrix[x][i];
        		matrix[x][i] = matrix[x][j];
        		matrix[x][j] = val;
        	}
        	i++;
        	j--;
        }
        return matrix;
    }

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] ans = rotate(arr);
		for(int[] x:ans) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
