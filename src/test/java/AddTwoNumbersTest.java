import org.junit.jupiter.api.Test;
import util.ListNode;
import util.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.*;
import static util.ListNodeUtils.addToTheLast;

class AddTwoNumbersTest {

    @Test
    void testAddsTwoNumbersWithTwoEqualListSize() {
        ListNode head1 = new ListNode(3);
        ListNode secondNode = new ListNode(4, head1);
        ListNode thirdNode = new ListNode(2, secondNode);

        ListNode head2 = new ListNode(4);
        ListNode secondNode2 = new ListNode(6, head2);
        ListNode thirdNod2 = new ListNode(5, secondNode2);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(thirdNode, thirdNod2);

        ListNode headResult = new ListNode(8);
        ListNode secondNodeResult = new ListNode(0, headResult);
        ListNode thirdNodeResult = new ListNode(7, secondNodeResult);

        assertEquals(thirdNodeResult, result);
    }

    @Test
    void testAddsTwoNumbersWithTwoEqualListSizeWithZeroValue() {
        ListNode head1 = new ListNode(0);

        ListNode head2 = new ListNode(0);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(head1, head2);

        ListNode headResult = new ListNode(0);

        assertEquals(headResult, result);
    }

    @Test
    void testAddsTwoNumbersWithDifferentListSize() {
        ListNode head1 = new ListNode(9);
        ListNode head1ListNode2 = addToTheLast(head1, new ListNode(9));
        ListNode head1ListNode3 = addToTheLast(head1ListNode2, new ListNode(9));
        ListNode head1ListNode4 = addToTheLast(head1ListNode3, new ListNode(9));
        ListNode head1ListNode5 = addToTheLast(head1ListNode4, new ListNode(9));
        ListNode head1ListNode6 = addToTheLast(head1ListNode5, new ListNode(9));
        ListNode head1ListNode7 = addToTheLast(head1ListNode6, new ListNode(9));

        ListNode head2 = new ListNode(9);
        ListNode head2ListNode2 = addToTheLast(head2, new ListNode(9));
        ListNode head2ListNode3 = addToTheLast(head2ListNode2, new ListNode(9));
        ListNode head2ListNode4 = addToTheLast(head2ListNode3, new ListNode(9));


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(head1, head2);

        ListNode headResult = new ListNode(8);
        ListNode tailResult1 = addToTheLast(headResult, new ListNode(9));
        ListNode tailResult2 = addToTheLast(tailResult1, new ListNode(9));
        ListNode tailResult3 = addToTheLast(tailResult2, new ListNode(9));
        ListNode tailResult4 = addToTheLast(tailResult3, new ListNode(0));
        ListNode tailResult5 = addToTheLast(tailResult4, new ListNode(0));
        ListNode tailResult6 = addToTheLast(tailResult5, new ListNode(0));
        ListNode tailResult7 = addToTheLast(tailResult6, new ListNode(1));

        assertEquals(headResult, result);
    }
}