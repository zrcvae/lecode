package list;

public class test2 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){};

        public ListNode(int val) {
            this.val = val;
        }
    }
    class MyLinkedList {
        //链表元素个数
        int size;
        //虚拟头节点
        ListNode head;

        //初始化链表
        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        //获取链表中第 index 个节点的值。如果索引无效，则返回-1。
        public int get(int index) {
            if (index < 0 || index>= size){
                return -1;
            }
            ListNode cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
            return cur.val;

        }

        //在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点
        public void addAtHead(int val) {
            addAtIndex(0, val);

        }

        //将值为 val 的节点追加到链表的最后一个元素。
        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index <=0){
                index = 0;
            }
            if (index > size){
                return;
            }
            size++;
            ListNode pre = head;
            for (int i = 0; i < index ; i++) {
                pre = pre.next;
            }
            ListNode toAdd = new ListNode(val);
            toAdd.next = pre.next;
            pre.next = toAdd;


        }

        //如果索引 index 有效，则删除链表中的第 index 个节点。
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size){
                return;
            }
            size--;
            if (index == 0){
                head = head.next;
                return;
            }
            ListNode cur = head;
            for (int i = 0; i < index ; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }

}
