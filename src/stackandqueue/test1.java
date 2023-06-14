package stackandqueue;

import javax.jws.Oneway;
import java.util.Stack;

public class test1 {
    Stack<Integer> In;
    Stack<Integer> Out;

    // 初始化
    public test1() {
        In = new Stack<>();
        Out = new Stack<>();
    }

    // 入栈
    public void push(int x) {
        In.push(x);

    }

    // 出栈
    public int pop() {
        dumpIn();
        return Out.pop();

    }

    public int peek() {
        dumpIn();
        return Out.peek();

    }

    public boolean empty() {
        return In.isEmpty() && Out.isEmpty();

    }
    private void dumpIn(){
        if (!Out.isEmpty()) return;
        while (!In.isEmpty()){
            Out.push(In.pop());
        }
    }
}
