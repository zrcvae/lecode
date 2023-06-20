package selfTest;

import java.util.HashSet;
import java.util.Set;

// 快乐数
public class test18 {
    public boolean isHappy(int n) {
        // 使用set集合，可以避免重复元素
        Set<Integer> res = new HashSet<>();
        while (n != 1 && !res.contains(n)){
            res.add(n);
            n = getNextNumber(n);
        }
        return n == 1;

    }
    private int getNextNumber(int n){
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }
}
