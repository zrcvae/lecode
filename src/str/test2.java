package str;

// 反转字符串Ⅱ
public class test2 {
    public String reverseStr(String s, int k) {
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length ; i += 2 * k) {
            int left = i;
            // 定义尾指针（判断尾数够不够k个来取决end指针的位置）
            int right = Math.min(result.length - 1, left + k -1);
            while (left < right){
                char temp = result[left];
                result[left] = result[right];
                result[right] = temp;
                left++;
                right--;
            }
        }
        return new String(result);

    }
}
