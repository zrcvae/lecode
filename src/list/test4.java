package list;

public class test4 {
    public class ListNode {
        int val;
        test4.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, test4.ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode temp =null;
        ListNode temp1 = null;
        while (cur.next != null && cur.next.next != null){
            temp = cur.next;
            temp1 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp;
            temp.next = temp1;
            cur = cur.next.next;
        }
        return dummy.next;

    }
}
