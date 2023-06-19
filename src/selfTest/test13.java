package selfTest;
// 删除链表的倒数第n个节点
public class test13 {
    // 大概思路：双指针，第一个指针先走n步，然后两个指针同时走，快指针走到最后为找到目标元素
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dump = new ListNode(-1);
        dump.next = head;
        ListNode fast = dump;
        ListNode low = dump;
        while (n > 0){
            fast = fast.next;
            n--;
        }
        while (fast.next != null){
            fast = fast.next;
            low = low.next;
        }
        low.next = low.next.next;
        return dump.next;
    }
}
