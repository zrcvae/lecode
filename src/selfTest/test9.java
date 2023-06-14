package selfTest;

import java.util.LinkedList;

public class test9 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(6);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
//        while (head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }
        LinkedList<Integer> node = new LinkedList<>();
        node.add(1);
        node.add(2);
        node.add(6);
        node.add(3);
        System.out.println(node);


    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode dump = new ListNode(-1, head);
        ListNode pre = dump;
        ListNode cur = head;
        while (cur != null){
            if (cur.val == val){
                pre.next = cur.next;
            }else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return dump.next;
    }

}
