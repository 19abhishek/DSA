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
			if(a.end == b.end) {
                return a.start - b.start;
            }
            return a.end - b.end;
		}
	}
	
	public static int maxMeetings(int start[], int end[], int n)
    {
ArrayList<meeting> meet = new ArrayList<>();
        
        for(int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i], i+1));
        
        meetingComparator mc = new meetingComparator(); 
        Collections.sort(meet, mc);
        // for(meeting cm: meet) {
        // 	System.out.println(cm.start+" "+cm.end+" "+cm.pos);
        // }
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
        return answer.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
