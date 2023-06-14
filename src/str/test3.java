package str;

public class test3 {
    // 双指针法
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0){
            return s;
        }
        // 扩充空间，空格数量2倍
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == ' '){
                str.append("  ");
            }
        }
        // 如果没有空格，直接返回
        if (str.length() == 0){
            return s;
        }
        // 有空格，定义双指针
        int left = s.length() - 1;//原始字符串最后一个
        s += str.toString();
        int right = s.length() - 1;//扩充字符串最后一个
        char[] chars = s.toCharArray();
        while (left >= 0){
            if (chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '$';
            }else {
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        return new String(chars);
    }

}
