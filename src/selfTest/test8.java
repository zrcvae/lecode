package selfTest;
// 长度最小的子数组(滑动窗口)
public class test8 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int count = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            // 当滑动窗口的数值大于target，左边的位置向前，缩小窗口的大小
            while (count >= target){
                res = Math.min(res, i - left + 1);
                count -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
