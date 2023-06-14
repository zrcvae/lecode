package huisu;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class test4 {
    List<List<String>> res = new ArrayList<>();
    Deque<String> deque = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return res;

    }
    private void backTracking(String s, Integer start){
        if (start >= s.length()){
            res.add(new ArrayList<>(deque));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            // 先判断是否是回文
            if (isPalindrome(s, start, i)){
                String substring = s.substring(start, i + 1);
                deque.addLast(substring);
            }else {
                continue;
            }
            backTracking(s, i + 1);
            deque.removeLast();
        }
    }
    // 判断是否是回文
    private boolean isPalindrome(String s, Integer start, int end){
        for (int  i = start, j = end;  i < j;  i++, j--) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
