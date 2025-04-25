package T0021MergeTwoSortedLists;

public class Solution {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(list1, list2);
        System.out.println("f");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp = new ListNode();
        ListNode next = tmp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                next.next = list1;
                list1 = list1.next;
            } else {
                next.next = list2;
                list2 = list2.next;
            }
            next = next.next;
        }
        if (list1 != null) {
            next.next = list1;
        } else if (list2 != null) {
            next.next = list2;
        }
        return tmp.next;
    }

}
