import java.util.Objects;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(4, listNode2);
        ListNode listNode4 = new ListNode(3, listNode3);
        ListNode listNode5 = new ListNode(2, listNode4);
        ListNode listNode6 = new ListNode(1, listNode5);

        System.out.printf("Inout: %s%n", "['a', 'b', 'a', 'c', 'a', 'b', 'a']");
        System.out.printf("Output: %s%n", middleOfTheLinkedList.middleNode(listNode6));
    }

    public ListNode middleNode(ListNode head) {
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
