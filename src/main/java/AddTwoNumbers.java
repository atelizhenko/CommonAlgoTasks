import util.ListNode;

/**
 * Task link: <a href="https://leetcode.com/problems/add-two-numbers/">here</a>
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode head = result;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            result.next = new ListNode(carry % 10);
            carry = carry / 10;
            result = result.next;
        }
        return head.next;
    }
}
