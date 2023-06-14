package list;

public class test5 {
    public class ListNode {
        int val;
        test5.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, test5.ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast.next !=null){
            if (n > 0){
                fast = fast.next;
                n--;
            }else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
