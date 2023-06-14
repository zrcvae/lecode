package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class test6 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1){
            return nums;
        }
        // 存放元素数组长度
        int len = nums.length - k + 1;
        int[] res = new int[len];
        int n = 0;
        MyQueue myQueue = new MyQueue();
        // 前k个元素放入队列中
        for (int i = 0; i < k ; i++) {
            myQueue.add(nums[i]);
        }
        res[n++] = myQueue.peek();
        for (int i = k; i < nums.length ; i++) {
            //滑动窗口移除最前面的元素，移除是判断该元素是否放入队列
            myQueue.poll(nums[i - k]);
            myQueue.add(nums[i]);
            res[n++] = myQueue.peek();

        }
        return res;

    }
}

// 定义数组
class MyQueue{
    Deque<Integer> deque = new LinkedList<>();
    // 弹出元素
    void poll(int value){
        if (!deque.isEmpty() && value == deque.peek()){
            deque.poll();
        }
    }

    // 添加元素
    void add(int value){
        while (!deque.isEmpty() && value > deque.getLast()){
            deque.removeLast();
        }
        deque.add(value);
    }
    // 返回队列顶部元素
    int peek(){
        return deque.peek();
    }

}