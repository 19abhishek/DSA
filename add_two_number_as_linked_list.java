package coding;

import java.util.*;

public class add_two_number_as_linked_list {
	
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        int carry =0;
        while(l1!=null && l2!=null) {
        	int csum = l1.val+l2.val + carry;
        	ListNode cNode;
        	if(csum<=9) {
        		cNode = new ListNode(csum);
        		carry = 0;
        	}else {
        		cNode = new ListNode(csum%10);
        		carry = 1;
        	}
        	l1 = l1.next;
        	l2=l2.next;
        	head.next = cNode;
        	head = head.next;
        }
        while(l1!=null) {
        	int csum = l1.val + carry;
        	ListNode cNode;
        	if(csum<=9) {
        		cNode = new ListNode(csum);
        		carry = 0;
        	}else {
        		cNode = new ListNode(csum%10);
        		carry = 1;
        	}
        	l1 = l1.next;
        	head.next = cNode;
        	head = head.next;
        }
        while(l2!=null) {
        	int csum = l2.val + carry;
        	ListNode cNode;
        	if(csum<=9) {
        		cNode = new ListNode(csum);
        		carry = 0;
        	}else {
        		cNode = new ListNode(csum%10);
        		carry = 1;
        	}
        	l2 = l2.next;
        	head.next = cNode;
        	head = head.next;
        }
        if(carry>0) {
        	ListNode cNode = new ListNode(carry);
        	head.next = cNode;
        	head = head.next;
        }
        return ans.next;
    }

	public static void main(String[] args) {
		
	}

}
