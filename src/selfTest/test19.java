package selfTest;

import java.util.HashMap;
import java.util.Map;

// 两数之和
public class test19 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length ==0){
            return result;
        }
        Map<Integer,Integer> res = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (res.containsKey(temp)){
                result[0] = i;
                result[1] = res.get(temp);
                break;  // 如果找到直接跳出循环
            }else {
                res.put(nums[i], i);  // 如果没有就将当前元素存入map数组
            }

        }
        return result;
    }

}
