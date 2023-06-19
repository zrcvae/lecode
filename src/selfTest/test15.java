package selfTest;

import java.util.List;

// 环形链表（判断一个链表是否有环）
public class test15 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        ListNode cur = head;
        // 这里的判断条件需要注意
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
            if (fast == low){  // 有环
                while (low != null){
                    if (low == cur){
                        return cur;
                    }
                    low = low.next;
                    cur = cur.next;
                }
            }
        }
        return null;
    }
}
