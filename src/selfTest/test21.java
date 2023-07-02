package selfTest;

import java.util.HashMap;
import java.util.Map;

// 赎金信，字符串1能否由字符串2中的字符组成
public class test21 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 由于本题字符串中只包含26个字母，所有可以只使用数组表示
        int[] res = new int[26];
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        for (int i = 0; i < magazine.length(); i++) {
            res[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            res[ransomNote.charAt(i) - 'a']--;
            if (res[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
