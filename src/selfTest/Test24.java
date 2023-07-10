package selfTest;

/**
 * @author zrc
 * @date 2023/07/06
 * 找出字符串中第一个匹配的下标
 */
public class Test24 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0){
            return 0;
        }
        // 初始化next数组
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            // 如果不相等，通过next数组回溯
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            // 如果j的之等于needle数组长度，说明匹配成功
            if (j == next.length){
                return i - needle.length() + 1;
            }
        }
        // 如果循环结果没有匹配成功，则失败
        return -1;
    }

    private void getNext(int[] next, String s) {
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)){
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)){
                j++;
            }
            next[i] = j;
        }
    }


}
