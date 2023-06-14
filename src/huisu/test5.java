package huisu;

import java.util.ArrayList;
import java.util.List;

// 复原ip地址
public class test5 {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return result;
        backTracking(s, 0 , 0);
        return result;

    }
    private void backTracking(String s, int start, int pointNum){
        // 表示有3个点分隔了，是一个合法的ip地址
        if (pointNum == 3){
            // 判断第四个字符串是否合法
            if (isValid(s, start, s.length() - 1)){
                result.add(s);
            }
        }
        for (int i = start; i < s.length(); i++) {
            if (isValid(s, start, i)){
                s = s.substring(0, i + 1) + '.' + s.substring(i + 1);
                pointNum++;
                backTracking(s, i + 2, pointNum);
                pointNum--;
                // 回溯删除点
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }else {
                break;
            }

        }

    }
    // 判断构成IP地址的字符串是否合法
    private Boolean isValid(String s, int start, int end){
        if (start > end){
            return false;
        }
        // 以0开头的数字不合法
        if (s.charAt(start) == '0' && start != end){
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            // 遇到数字字符不合法
            if (s.charAt(i) > '9' || s.charAt(i) < '0'){
                return false;
            }
            // 如果三位数字组合大于255也不合法
            num = num * 10 + s.charAt(i) - '0';
            if (num > 255){
                return false;
            }
        }
        return true;
    }
}
