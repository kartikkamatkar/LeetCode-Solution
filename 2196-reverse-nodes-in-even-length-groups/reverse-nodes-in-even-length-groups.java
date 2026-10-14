
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        int groupSize = 1;

        while (prev.next != null) {
        
            ListNode groupHead = prev.next;
            ListNode curr = groupHead;
            int count = 0;

            while (count < groupSize && curr != null) {
                curr = curr.next;
                count++;
            }
               if (count % 2 == 0) {
                // Reverse exactly count nodes
                ListNode oldHead = groupHead;
                ListNode nextGroup = curr;

                ListNode p = null;
                ListNode node = groupHead;

                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = p;
                    p = node;
                    node = next;
                }

                prev.next = p;
                oldHead.next = nextGroup;
                prev = oldHead; 
            }
                else {
                for (int i = 0; i < count; i++) {
                    prev = prev.next;
                }
            }

            groupSize++;
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
