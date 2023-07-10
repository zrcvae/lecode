package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和(不适合用哈希法去做，去重困难)本题使用双指针做法完成
public class test7 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 排序
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] > 0){
                return result;
            }
            // 去重
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0){
                    right--;
                }else if (sum < 0){
                    left++;
                }else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 对三元组中的b和c去重
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    while (right > left && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    right--;
                    left++;
                }
            }
        }

        return result;
    }
}

