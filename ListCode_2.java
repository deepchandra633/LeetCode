public class ListCode_2 {
    int val;
    ListCode_2 next;

    ListCode_2() {
    }

    ListCode_2(int val) {
        this.val = val;
    }

    ListCode_2(int val, ListCode_2 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListCode_2 addTwoNumbers(ListCode_2 l1, ListCode_2 l2) {
        ListCode_2 head = null;
        ListCode_2 tail = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;
            int ans = val1 + val2 + carry;
            ListCode_2 newNode = new ListCode_2(ans % 10);
            ;
            carry = ans / 10;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head;
    }
}
