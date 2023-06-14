package str;
// 左旋字符串
public class test5 {
    public static void main(String[] args) {
        test5 t5 = new test5();
        String s = "hello world";
        String t = t5.reverseLeftWords(s, 2);
        System.out.println(t);
    }
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        reverseString(sb, 0, n - 1);  // 旋转前n个字符
        reverseString(sb, n, len - 1);  // 旋转前n个后的字符
        reverseString(sb, 0 , len - 1);  // 旋转整个字符串
        return sb.toString();

    }
    // 旋转指定位置字符串
    private void reverseString(StringBuilder sb, int start, int end){
        while (start <= end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }

    }
}
