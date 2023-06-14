package stackandqueue;

import java.util.Stack;
// 逆波兰表达式求值
public class test5 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String c;
        for (int i = 0; i < tokens.length ; i++) {
            c = tokens[i];
            if ("+".equals(c)){
                st.push(st.pop() + st.pop());
            }else if ("*".equals(c)){
                st.push(st.pop() * st.pop());
            }else if ("-".equals(c)){
                st.push(-st.pop() * st.pop());
            }else if ("/".equals(c)){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2 / num1);
            } else {
                st.push(Integer.valueOf(c));
            }

        }
        return st.pop();

    }

}
