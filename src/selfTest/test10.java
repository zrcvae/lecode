package selfTest;
// 设计链表
public class test10 {
    int size;  // 链表元素个数
    ListNode head; // 头节点
    // 初始化链表
    public test10(){
        int size = 0;
        head = new ListNode(0);
    }
    // 获取链表下标为index的节点值
    public int get(int index){
        if (index < 0 || index > size){
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i <= index ; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    // 头节点插入
    public void addHead(int val){
        addIndex(0, val);
    }
    // 尾节点插入
    public void addTail(int val){
        addIndex(size, val);
    }
    // 插入元素
    public void addIndex(int index, int val){
        ListNode pre = head;
        if (index <= 0){
            index = 0;
        }
        if (index > size){
            return;
        }
        size++;  // 插入了一个元素
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode temp = new ListNode(val);
        temp.next = pre.next;
        pre.next = temp;
    }
    // 删除节点
    public void deleteAtIndex(int index){
        if (index < 0 || index > size){
            return;
        }
        size--;
        // 需要判断是否为头节点
        if (index == 0){
            head = head.next;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }


}
