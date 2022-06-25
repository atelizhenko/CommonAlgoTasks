import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeLinkedListTest {

    @Test
    void testPalindromeSimpleCase() {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2, head);

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        assertFalse(palindromeLinkedList.isPalindrome(secondNode));
    }

    @Test
    void testPalindromeCommonCase() {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2, head);
        ListNode thirdNode = new ListNode(2, secondNode);
        ListNode fourthNode = new ListNode(1, thirdNode);

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        assertTrue(palindromeLinkedList.isPalindrome(fourthNode));
    }
}