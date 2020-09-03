package com.longest;

public class ListNodeMain {

	public static void main(String[] args) {

		
		ListNode l1 = new ListNode();
		l1.val = 1;
		l1.next = new ListNode(10);
		l1.next.next = new ListNode(6);
		ListNode l2 = new ListNode();
		l2.val = 2;
		
		ListNode lg = list(l1,l2);
		while(lg != null) {
			

			System.out.println(lg.val);
			lg = lg.next;
		
		}
	}

	public static ListNode list(ListNode l1, ListNode l2) {
		
		ListNode dummy = new ListNode(-10);
        ListNode head = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }

            head = head.next;

        }

// this cases are present when the two lists are not equal there will be leftOver elements.
        if (l1 != null) {
            head.next = l1;
        }

        if (l2 != null) {
            head.next = l2;
        }

        return dummy.next;
        
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
