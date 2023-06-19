package selfTest;
// 两两交换链表中的节点
public class test12 {
    public ListNode swapPairs(ListNode head) {
        ListNode dump = new ListNode(-1);
        dump.next = head;  // 虚拟头节点
        ListNode cur = dump;
        ListNode first;  // 交换过程中保留第一个节点
        ListNode second;  // 交换过程中保留第二个节点
        while (cur.next != null && cur.next.next != null){
            ListNode temp = cur.next.next.next;  // 保留第三个节点
            first = cur.next;
            second = cur.next.next;
            cur.next = second;  // 第0个节点指向第二个节点
            second.next = first;  // 第二个节点指向第一个节点
            first.next = temp;  // 第一个节点指向第三个节点
            cur = first;  // 头节点移动
        }
        return dump.next;
    }
}
