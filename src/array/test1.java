package array;

public class test1 {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int x = 9;
        System.out.println(search(nums, x));
    }
    public static int search(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if(nums[0] > target || nums[nums.length-1]<target)return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + ((right - left) >> 1);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }
}
