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
    public ListNode reverseList(ListNode head) {
        ListNode newdummy=null;
        //Checking when head is not equal to null
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=newdummy;
            newdummy = head;
            head = next;
        }
        return newdummy;
    }
}