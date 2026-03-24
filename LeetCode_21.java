
public class LeetCode_21 {
      int val;
      LeetCode_21 next;
      LeetCode_21() {}
      LeetCode_21(int val) { this.val = val; }
      LeetCode_21(int val, LeetCode_21 next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public LeetCode_21 mergeTwoLists(LeetCode_21 l1, LeetCode_21 l2) {
        LeetCode_21 dummy = new LeetCode_21(0);
        LeetCode_21 curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;

            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;

    }
}