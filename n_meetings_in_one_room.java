package coding;

import java.util.*;

public class n_meetings_in_one_room {
	
	static class meeting {
		int start, end, pos;
		meeting(int start, int end, int pos) {
			this.start =  start;
			this.end = end;
			this.pos = pos;
		}
	}
	
	static class meetingComparator implements Comparator<meeting> {
		public int compare(meeting a, meeting b) {
			if(a.start > b.start) {
				return -1;
			}
			return 1;
		}
	}
	
	public static int maxMeetings(int start[], int end[], int n)
    {
		ArrayList<meeting> meet = new ArrayList<>();
        
        for(int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i], i+1));
        
        meetingComparator mc = new meetingComparator(); 
        Collections.sort(meet, mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
        System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0;i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
