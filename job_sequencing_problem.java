package coding;

import java.util.*;

public class job_sequencing_problem {
	
	class compareJobs implements Comparator<Job> {
		public int compare(Job a, Job b) {
			if(a.profit == b.profit) {
				return b.deadline - a.deadline;
			}
			return b.profit - a.profit;
		}
	}
	
	class Job {
		int id, profit, deadline;
		Job(int id, int profit, int deadline) {
			this.id = id;
			this.profit = profit;
			this.deadline = deadline;
		}
	}
	
	int[] JobScheduling(Job arr[], int n)
    {
        int ans[] = new int[2];
        Arrays.sort(arr, new compareJobs());
        //Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        int maxi = 0;
        for (int i = 0; i < n; i++) {
           if (arr[i].deadline > maxi) {
              maxi = arr[i].deadline;
           }
        }

        int result[] = new int[maxi + 1];

        for (int i = 1; i <= maxi; i++) {
           result[i] = -1;
        }

        int countJobs = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) {

           for (int j = arr[i].deadline; j > 0; j--) {

              // Free slot found 
              if (result[j] == -1) {
                 result[j] = i;
                 countJobs++;
                 jobProfit += arr[i].profit;
                 break;
              }
           }
        }

        //int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
        return ans;
    }

	public static void main(String[] args) {
		

	}

}
