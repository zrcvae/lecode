package greedy;
// 最大子序和（连续和为负数时就抛弃）
public class test1 {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > res){  // 如果前面连续最大子序和大于res
                res = count;
            }
            if (count < 0){  // 如果子序和小于0
                count = 0;
            }
        }
        return res;
    }
}
