package array;

public class test6 {
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen( target, nums));

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++){
            sum += nums[right];
            while (sum >= target){
                result = Math.min(result, right - left +1);
                sum -= nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 :result;

    }
}
