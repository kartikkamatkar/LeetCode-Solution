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
    private Random rand ;
    private  ListNode head;
    public Solution(ListNode head) {
       this.head = head;
       this.rand = new Random ();   
       } 
    public int getRandom() {
      ListNode curr = this.head;
      int count = 0;
      int result = curr.val;
      while(curr !=null){
        count++;
        if(rand.nextInt(count) == 0)
        {
            result = curr.val;

        }
        curr = curr.next ;

      }
      return result ;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */