package selfTest.stackandquequ;

import java.util.Stack;

/**
 * @author zrc
 * @date 2023/07/10
 * 用栈实现队列
 */
public class Test1 {
    Stack<Integer> InStack;
    Stack<Integer> OutStack;
    // 初始化
    public Test1(){
        InStack = new Stack<>();
        OutStack = new Stack<>();
    }
    // 入栈
    public void push(int x){
        InStack.push(x);
    }
    // 出栈
    public void pop(){
        dumpStackIn();
        OutStack.pop();
    }

    /**
     * 获取最后一个元素
     */
    public void peek(){
        dumpStackIn();
        OutStack.peek();
    }
    public boolean empty(){
        return InStack.isEmpty() && OutStack.isEmpty();
    }

    /**
     * 如果InStack为空，那么将stackIn中的元素全部放到OutStack中
     */
    private void dumpStackIn() {
        if (!OutStack.isEmpty()){
            return;
        }
        while (!InStack.isEmpty()){
            OutStack.push(InStack.pop());
        }
    }
}