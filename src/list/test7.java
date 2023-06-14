package list;

public class test7 {
    public class ListNode {
        int val;
        test7.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, test7.ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){//有环
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index1 != index2){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
