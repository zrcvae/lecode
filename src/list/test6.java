package list;

public class test6 {
    public class ListNode {
        int val;
        test6.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, test6.ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0;
        int lenB = 0;
        while (curA != null){
            lenA++;
            curA = curA.next;
        }
        while (curB != null){
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        if (lenB > lenA){
            //交换AB链表长度
            int tempLen = lenA;
            lenA = lenB;
            lenB = tempLen;
            //交换AB指针
            ListNode tempCurA = curA;
            curA = curB;
            curB = tempCurA;
        }
        int gap = lenA - lenB;
        while (gap-- > 0){
            curA = curA.next;
        }
        while (curA != null){
            if (curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }

}
