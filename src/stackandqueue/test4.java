package stackandqueue;

import java.util.Arrays;
import java.util.Stack;

public class test4 {
    public static void main(String[] args) {
        test4 t = new test4();
        String s = "abbaca";
        String s1 = t.removeDuplicates(s);
        System.out.println(s1);
    }
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char c;
        for (int i = 0; i < s.length() ; i++) {
            c = s.charAt(i);
            if (st.isEmpty() || c != st.peek()){
                st.push(c);
            }else {
                st.pop();
            }
        }
        String str = "";
        while (!st.isEmpty()){
//            System.out.println(st.peek());
            str = st.peek() + str;
            st.pop();
        }
        return str ;
    }
}
