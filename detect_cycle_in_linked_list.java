package coding;

import java.util.*;

public class detect_cycle_in_linked_list {
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
        ListNode fast = head;
        while(fast!=null) {
        	slow = slow.next;
        	fast = fast.next;
        	if(fast!=null && fast.next!=null) {
        		fast = fast.next;
        	}else {
                break;
            }
        	if(slow == fast && slow.next == fast.next) {
        		return true;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
