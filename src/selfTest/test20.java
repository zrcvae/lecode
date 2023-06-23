package selfTest;

import java.util.HashMap;
import java.util.Map;

public class test20 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                // 如果已经存在这个数值，就将map数组的value + 1,如果不存在就存入数组，value为1
                int temp = nums1[i] + nums2[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        // 再从剩下的数组中找是否存在两数和与map中的key值和为0，如果存在将key值对应的value添加到返回结果
        int res = 0;
        for (int i : nums3){
            for (int j : nums4){
                res += map.getOrDefault(0 - i - j, 0);
            }
        }
        return res;
    }
}
