package selfTest;
// 左旋转字符串
public class test2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        int len  = s.length() - 1;
        reverse(sb,0, n -1);
        reverse(sb, n, len);
        return sb.reverse().toString();
    }

    private void reverse(StringBuilder sb, int start, int end) {
        for (int i = start, j = end; i <= j; i++, j--) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }
    }
}

