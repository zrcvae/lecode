package selfTest;
// 表示数值的字符串
//难点在于归纳各种正确的情况
//‘.’出现正确情况：只出现一次，且在e的前面
//‘e’出现正确情况：只出现一次，且出现前有数字
//‘+’‘-’出现正确情况：只能在开头和e后一位
public class test3 {
    public static void main(String[] args) {
        test3 t = new test3();
        boolean x = t.isNumber("1");
        System.out.println(x);
    }
    public  boolean isNumber(String s) {
        if (s == null || s.length() == 0) return false;
        // 去除空格
        s.trim();
        boolean numFlag = false;
        boolean doFlag = false;
        boolean eFlag = false;
        for (int i = 0; i < s.length(); i++) {
            // 如果为数字
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numFlag = true;
                // 如果为. 则前面没有出现e或者数字
            } else if (s.charAt(i) == '.' && !doFlag && !eFlag){
                doFlag = true;
                // 如果为e，则要求前面没有出现e以及没有出现数字
            } else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && !eFlag && numFlag){
                eFlag = true;
                numFlag = false;
                // 如果为+或者- 要求前面一个为e
            }else if ((s.charAt(i) == '+' || (s.charAt(i) == '-' ) && (i == 0 || s.charAt(i - 1) == 'e') || s.charAt(i) == 'E')){

            }else {
                return false;
            }
        }
        return numFlag;
    }
}
