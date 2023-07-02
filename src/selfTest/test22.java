package selfTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 三数之和（使用双指针写法）
public class test22 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 使用双指针需要对数组进行排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 如果第一个数字大于0，直接返回
            if (nums[i] > 0){
                return res;
            }
            // 去重操作
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0){
                    right--;
                }else if (sum < 0){
                    left++;
                }else {
                    // Arrays.asList将数组转化为集合
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重
                    while (right > left && nums[right] == nums[right - 1]){
                        right--;
                    }
                    while (right > left && nums[left] == nums[left + 1]){
                        left++;
                    }
                    right--;
                    left++;
                }
            }
        }
        return res;
    }
}
