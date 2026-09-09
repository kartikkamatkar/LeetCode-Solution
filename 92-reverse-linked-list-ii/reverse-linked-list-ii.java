/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     L+istNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
    if(left == 1){
        return reversal(head , right);
    }
    head.next = reverseBetween(head.next, left -1, right-1);
        return head ;
    }
    ListNode last = null ;
    public ListNode reversal(ListNode head , int n ){
        if(n ==1){
            last = head.next;
            return head;
        }
        ListNode newNode = reversal(head.next,n-1);
        head.next.next = head;
        head.next= last;
        return newNode;
    }

}