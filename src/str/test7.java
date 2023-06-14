package str;

public class test7 {
    public boolean repeatedSubstringPattern(String s) {
        // 如果字符串为空
        if (s.equals("")) return false;
        int len = s.length();
        s = " " + s;
        char[] chars = s.toCharArray();
        int[] next = new int[len + 1];
        // 构造next数组
        for (int i = 2, j = 0; i <= len ; i++) {
            while (j > 0 && chars[i] != chars[j + 1])
                j = next[j];
            if (chars[i] == chars[j + 1])
                j++;
            next[i] = j;
        }
        // 判断是否是重复字串
        if (next[len] > 0 && len % (len - next[len]) == 0)
            return true;
        return false;

    }
}
