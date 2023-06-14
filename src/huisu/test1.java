package huisu;

import java.util.ArrayList;
import java.util.List;

// 电话号码的字母组合
public class test1 {
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return res;
        }
        // 初始化一个数组，模拟键盘数字对应的字母
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // 迭代处理
        backtrack(digits, numString, 0);
        return res;
    }
    // 由于会出现大量字符换拼接，所以这里选择更为高效的 StringBuild
    StringBuilder temp = new StringBuilder();
    private void backtrack(String digits, String[] numString, int num){
        if (num == digits.length()){
            res.add(temp.toString());
            return;
        }
        // str表示当前数字对应键盘中的字母
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i ++){
            temp.append(str.charAt(i));
            backtrack(digits, numString, num + 1);
            temp.deleteCharAt(temp.length() - 1);
        }

    }
}
