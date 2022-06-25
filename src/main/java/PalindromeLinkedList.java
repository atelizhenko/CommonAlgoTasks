import java.util.Objects;

/**
 * Algorithm:
 * 1. Get the middle of the linked list.
 * 2. Reverse the second half of the linked list.
 * 3. Check if the first half and second half are identical.
 * 4. (Optional) Construct the original linked list by reversing the second half again and attaching it back to the first half
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        ListNode listNode1 = new ListNode('a');
        ListNode listNode2 = new ListNode('b', listNode1);
        ListNode listNode3 = new ListNode('a', listNode2);
        ListNode listNode4 = new ListNode('c', listNode3);
        ListNode listNode5 = new ListNode('a', listNode4);
        ListNode listNode6 = new ListNode('b', listNode5);
        ListNode listNode7 = new ListNode('a', listNode6);

        System.out.printf("Inout: %s%n", "['a', 'b', 'a', 'c', 'a', 'b', 'a']");
        System.out.printf("Output: %s%n", palindromeLinkedList.isPalindrome(listNode7));
    }

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;
        // for odd elements
        ListNode prevSlowPointer = head;
        ListNode middleNode = null;
        ListNode secondHalf;


        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            prevSlowPointer = slowPointer;
            slowPointer = slowPointer.next;
        }

        if (fastPointer != null) {
            middleNode = slowPointer;
            slowPointer = slowPointer.next;
        }

        secondHalf = slowPointer;
        prevSlowPointer.next = null;
        secondHalf = reverse(secondHalf);

        boolean result = compareNodes(head, secondHalf);

        if (middleNode != null) {
            prevSlowPointer.next = middleNode;
            middleNode.next = secondHalf;
        } else {
            prevSlowPointer.next = secondHalf;
        }

        return result;
    }

    private boolean compareNodes(ListNode head, ListNode second) {
        ListNode temp1 = head;
        ListNode temp2 = second;
        while (temp1 !=null && temp2 != null) {
            if (temp1.val == temp2.val) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                return false;
            }
        }

        return temp1 == null && temp2 == null;
    }

    private ListNode reverse(ListNode head) {
        //reverse second half
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

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(char val) {
            this(val, null);
        }

        ListNode(int val) {
            this(val, null);
        }

        ListNode (char val, ListNode next) {
            this((int) val, next);
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}



