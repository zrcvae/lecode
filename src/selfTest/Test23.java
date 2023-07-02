package selfTest;
//  反转字符串中的单词
public class Test23 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        Test23 t = new Test23();
        t.reverseWords(s);
    }
    /**
     * 思路：
     * 1、去除多余空格
     * 2、翻转每个单词
     * 3、翻转整个字符串
     */
    public String reverseWords(String s) {
        if (s == null || s.length() == 0){
            return s;
        }
        // 去空格
        s = removeSpace(s);
        char[] ch = s.toCharArray();

        int start = 0;
        // 翻转整个字符串
        reversal(ch, 0, ch.length - 1);
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] == ' '){
//                reversal(ch, start, i - 1);
//                start = i + 1;
//            }else {
//                continue;
//            }
//
//        }
        reverseEachWord(ch);
        return new String(ch);
    }
    private void reversal(char[] ch, int start, int end){
        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
    private String removeSpace(String s){
        int start = 0;
        int end = s.length() - 1;
        // 去除字符前空格
        while (s.charAt(start) == ' '){
            start++;
        }
        // 去除字符后空格
        while (s.charAt(end) == ' '){
            end--;
        }
        StringBuilder sb = new StringBuilder();
        // 去重字符中空格
        while (start <= end){
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' '){
                sb.append(c);
            }
            start++;
        }
        return sb.toString();
    }
    // 翻转每个单词
    private void reverseEachWord(char[] ch) {
        int start = 0;
        int end = 1;
        int n = ch.length;
        while (start < n) {
            while (end < n && ch[end] != ' ') {
                end++;
            }
            reversal(ch, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }
}
