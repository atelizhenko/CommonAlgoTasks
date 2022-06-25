package util;

public class ListNodeUtils {
    private ListNodeUtils() {

    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode tempNext;
        while (head != null) {
            tempNext = head.next;
            head.next = prev;
            prev = head;
            head = tempNext;
        }
        head = prev;

        return head;
    }

    public static int length(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static ListNode middle(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }
}
