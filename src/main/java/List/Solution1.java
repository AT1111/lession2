package List;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        ListNode example1;
        int[] head = {1,2,3,4,5};
        // int[] head = {1,2};
        // int[] head = {};

        example1 = ListNode.arrayToListNode(head);

        System.out.print("Input: ");
        ListNode.print(example1);

        System.out.print("Output: ");
        example1 = reverseList(example1);
        ListNode.print(example1);

        System.out.print("Output recursively: ");
        example1 = reverseListRecursiv(null,example1);
        ListNode.print(example1);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current;
        ListNode prev = null;

        while(head != null) {
            current = head.next;
            head.next = prev;
            prev = head;
            head = current;
        }
        return prev;
    }

    public static ListNode reverseListRecursiv(ListNode prev, ListNode head) {
        ListNode current;

        if(head != null) {
            current = head.next;
            head.next = prev;
            prev = reverseListRecursiv(head, current);
        }

        return prev;
    }
}
