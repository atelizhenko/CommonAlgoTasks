package util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(char val) {
        this(val, null);
    }

    public ListNode(int val) {
        this(val, null);
    }

    public ListNode(char val, ListNode next) {
        this((int) val, next);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
