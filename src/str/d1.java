package str;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class d1 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return res; // 算是剪枝了
        backTrack(s, 0, 0);
        return res;
    }

    private void backTrack(String s, int start, int num) {
        if (num == 3){
            if (isVaild(s, start, s.length() - 1)){
                res.add(s);
            }
        }
        for (int i = start; i < s.length(); i++) {
            if (isVaild(s, start, i)){
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                num++;
                backTrack(s, i + 2 , num);
                num--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }else {
                break;
            }
        }
    }

    private boolean isVaild(String s, int start, int end) {
        if (start > end) return false;
        if (s.charAt(start) == '0' && start != end) return false;
        int num = 0;
        for (int i = start; i < end; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9' ){
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255){
                return false;
            }
        }
        return true;
    }
}
