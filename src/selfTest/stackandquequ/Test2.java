package selfTest.stackandquequ;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zrc
 * @date 2023/07/10
 * 用队列实现栈
 */
public class Test2 {
    Queue<Integer> queue1; // 和栈中保持一样元素的队列
    Queue<Integer> queue2; // 辅助队列
    /**
     * 初始化
     */
    public Test2() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        // 先将元素放在辅助队列中
        queue2.offer(x);
        // 如果原始栈中有元素，全部再移入到辅助队列中
        if (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        // 再利用一个临时队列，交换队列一和列队二
        Queue<Integer> tempQueue;
        tempQueue = queue1;
        queue1 = queue2;
        queue2 = tempQueue;

    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
