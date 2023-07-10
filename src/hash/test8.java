package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 四数之和(采用和三数之和类似的操作方式) 找出数组中a+b+c+d=target
public class test8 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // 排序
        Arrays.sort(nums);
        // 第一层循环是确定a的值
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > 0 && nums[i] > target) {
                return result;
            }
            // 第一个数去重
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            // 第二层循环确定b的值
            for (int j = i + 1; j < nums.length; j++) {
                // 第二个数去重
                if (j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (right > left) {
                    // nums[k] + nums[i] + nums[left] + nums[right] > target int会溢出
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        right--;
                    }
                }
            }

        }
        return result;
    }
}
