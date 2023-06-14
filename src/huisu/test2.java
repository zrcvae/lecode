package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        test2 t = new test2();
        List list = t.letterCombinations("234");
        System.out.println(Arrays.toString(list.toArray()));

    }
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
            return res;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        track(digits, numString, 0);
        return res;
    }
    StringBuilder temp = new StringBuilder();
    private void track(String digits, String[] numString, int num){
        if (num == digits.length()){
            res.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length() ; i++) {
            temp.append(str.charAt(i));
            track(digits, numString, num + 1);
            temp.deleteCharAt(temp.length() - 1);
        }

    }
}
