package T0002AddTwoNumbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode resultNext = result;
        int registry = 0;
        while (l1 != null || l2 != null || registry != 0) {
            int first = l1 == null ? 0 : l1.val;
            int second = l2 == null ? 0 : l2.val;
            int newNumber = first + second + registry;
            if (newNumber > 10) {
                registry = 1;
                newNumber = newNumber - 10;
            } else {
                registry = 0;
            }

            ListNode newListNode = new ListNode(newNumber);
            resultNext.next = newListNode;
            resultNext = newListNode;


            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

        }
        return result.next;
    }

}
