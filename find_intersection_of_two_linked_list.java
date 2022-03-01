package coding;

import java.util.*;

public class find_intersection_of_two_linked_list {
	
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA;
        ListNode n2 = headB;
        while(n1!=n2) {
        	n1 = n1 == null ? headB:n1.next;
        	n2 = n2 == null ? headA:n2.next;
        }
        return n1;
    }

	public static void main(String[] args) {
		

	}

}
