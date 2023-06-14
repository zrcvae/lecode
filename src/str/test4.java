package str;
// 整体思想：
//    移除多余空格
//    将整个字符串反转
//    将每个单词反转
public class test4 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        reverseString(sb, 0, sb.length() -1);
        reverseEachWord(sb);
        return sb.toString();

    }
    // 移除多余空格
    private StringBuilder removeSpace(String s){
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while (start <= end){
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() -1) !=' '){
                sb.append(c);
            }
            start++;
        }
        return sb;
    }
    // 反转指定区间字符串
    private void reverseString(StringBuilder sb, int start, int end){
        while (start <= end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    // 反转每个单词
    private void reverseEachWord(StringBuilder sb){
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n){
            while (end < n && sb.charAt(end) != ' '){
                end++;
            }
            reverseString(sb, start, end -1);
            start = end + 1;
            end = start + 1;
        }

    }
}
