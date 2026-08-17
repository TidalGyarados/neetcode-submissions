/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        
        ListNode l1 = head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode l2 = null;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow; // Track the end of the first list
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null; // End the first list

        l2 = slow;
        
        //Reverse the list l2;
        l2 = reverseList(l2);

        while(l1 != null) {
            ListNode l1Next= l1.next;
            ListNode l2Next= l2.next;
            l1.next = l2;
            if (l1Next == null) {
                break;
            }

            l2.next = l1Next;
            l1 = l1Next;
            l2 = l2Next;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
