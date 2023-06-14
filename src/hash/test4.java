package hash;

import java.util.HashMap;
import java.util.Map;

public class test4 {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        if (nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)){ //判断集合中是否有temp
                res[1] = i;
                res[0] = map.get(temp);
                break;
            }
            map.put(nums[i], i);

        }
        return res;
    }
}
