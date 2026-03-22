class Solution {

 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while (h1 != null || h2 != null || carry != 0) {
            int val1 = (h1 != null) ? h1.val : 0;
            int val2 = (h2 != null) ? h2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (h1 != null) h1 = h1.next;
            if (h2 != null) h2 = h2.next;
        }

        return reverse(dummy.next);
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