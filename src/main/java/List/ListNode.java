package List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode arrayToListNode(int[] head ) throws Exception {
        ListNode listNode=null;
        if(head.length > 5000) {
            throw new Exception("Bad number of nodes.");
        }

        for(int i = head.length-1; i>=0; i--) {
            if(head[i] > 5000 || head[i] < -5000) {
                throw new Exception("Bad node value.");
            }
            listNode = new ListNode(head[i],listNode);
        }
        return listNode;
    }

    public static void print(ListNode listNode ) {
        ListNode current=listNode;

        System.out.print('[');
        while(current!=null) {
            System.out.print(current.val);
            current=current.next;
            if(current!=null) {
                System.out.print(',');
            }
        }
        System.out.println(']');
    }
}
