package selfTest;
// 反转整个链表
public class test11 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode temp;
        // 双指针，前面的指向后面
        while (head != null){
            temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
