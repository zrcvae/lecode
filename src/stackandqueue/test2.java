package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class test2 {
    Deque<Integer> q1;
    public test2() {
        q1 = new ArrayDeque<>();
    }

    public void push(int x) {
        q1.addLast(x);

    }

    public int pop() {
        int size = q1.size();
        size--;
        while (size-- > 0){
            q1.addLast(q1.peek());
            q1.pollFirst();
        }
        return q1.pollFirst();

    }

    public int top() {
        return q1.peekLast();

    }

    public boolean empty() {
        return q1.isEmpty();

    }
}
