package array;

import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
        int nums[] = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }



    public static int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int k = nums.length - 1;
        int result[] = new int[nums.length];
        while (l <= r){
            if(nums[l] * nums[l] > nums[r] * nums[r]){
                result[k] = nums[l] * nums[l];
                k--;
                l++;
            }else {
                result[k] = nums[r] * nums[r];
                k--;
                r--;
            }
        }
        return result;
    }
}
