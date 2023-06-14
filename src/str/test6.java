package str;
// 使用KMP算法
public class test6 {
    public static void main(String[] args) {
        String s1 = "mississippi";
        String s2 = "issip";
        test6 t6 = new test6();
        System.out.println(t6.strStr(s1, s2));
    }
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int[] next = new int[needle.length()];
        getNext(next, needle);

        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)){  // 字符串不匹配，j按照next表移动
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)){  // 如果字符串匹配，j向后移
                j++;
            }
            if (j == needle.length()){
                return i - needle.length() + 1;
            }
        }
        return -1;
    }
    // 获得前缀表
    private void getNext(int[] next, String s){
        int j = 0;  // j指向前缀末尾位置
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {  // i指向后缀末尾位置
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
