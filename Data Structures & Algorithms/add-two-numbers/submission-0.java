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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;
        int carry = 0;
        int sum = 0;
        int digit1 = 0;
        int digit2 = 0;
        while(l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                digit1 = l1.val;
                l1 = l1.next;
            } else {
                digit1 = 0;
            }

            if (l2 != null) {
                digit2 = l2.val;
                l2 = l2.next;
            } else {
                digit2 = 0;
            }
            sum = digit1 + digit2 + carry;
            ListNode tmp = new ListNode(sum%10);
            curr.next = tmp;
            curr = curr.next;
            carry = sum/10;
        }

        return dummyNode.next;
    }
}
