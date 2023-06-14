package selfTest;
// 剑指 Offer 67. 把字符串转换成整数

/**
 * 首部空格： 删除之即可；
 * 符号位： 三种情况，即 ''++'' , ''−−'' , ''无符号" ；新建一个变量保存符号位，返回前判断正负即可。
 * 非数字字符： 遇到首个非数字的字符时，应立即返回。
 * 数字字符：
 *
 *     字符转数字： “此数字的 ASCII 码” 与 “ 00 的 ASCII 码” 相减即可；
 *     数字拼接： 若从左向右遍历数字，设当前位字符为 cc ，当前位数字为 xx ，数字结果为 resres ，则数字拼接公式为：
 */
public class test4 {
    public static void main(String[] args) {
        test4 t = new test4();
        int x = t.strToInt("42");
        System.out.println(x);

    }
    public int strToInt(String str) {
        // 先去除空格, 并转换为char类型的
        char[] chars = str.trim().toCharArray();
        if (chars.length == 0) return 0;
        int sign = 1; // 标记，如果第一个字符为- 则为-1
        int i = 1; // 如果第一个数字为负数，则记录一下从第二个数字开始，如果为正则从0开始
        int num = Integer.MAX_VALUE/10;
        int res = 0;
        if (chars[0] == '-'){
            sign = -1;
        }else if (chars[0] != '+'){
            i = 0;
        }
        for (int j = i; j < chars.length; j++) {
            // 如果第一个字符不为数字，则直接跳出循环
            if (chars[j] < '0' || chars[j] > '9') break;
            if (res > num || (res == num && chars[j] > '7')){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (chars[j] - '0');

        }
        return res * sign;
    }
}
