package selfTest;
// 链表相交
public class test14 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        ListNode ha = headA;
        ListNode hb = headB;
        // 分别计算两个链表的长度
        while (ha != null){
            len1++;
            ha = ha.next;
        }
        while (hb != null){
            len2++;
            hb = hb.next;
        }
        ha = headA;
        hb = headB;
        // 如果headA的链表长度大于headB
        if (len1 > len2){
            int temp = len1 - len2;
            // 让headA链表指针先一定长度差
            while (temp > 0){
                ha = ha.next;
                temp--;
            }
            // 返回相交的节点
            while (ha != null){

                if (ha == hb){
                    return ha;
                }
                ha = ha.next;
                hb = hb.next;
            }
        }else {
            int temp = len2 - len1;
            while (temp > 0){
                hb = hb.next;
                temp--;
            }
            while (hb != null){

                if (ha == hb){
                    return hb;
                }
                ha = ha.next;
                hb = hb.next;
            }
        }
        return null;
    }
}
