package selfTest;
// 有序数的平方
public class test7 {
    public static void main(String[] args) {
        test7 t = new test7();
        int[] n = {-4,-1,0,3,10};

        System.out.println(t.sortedSquares(n));
    }
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int fast = nums.length - 1;
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i++) {
            if ((nums[low] * nums[low]) < (nums[fast] * nums[fast])){
                res[i] = (nums[fast] * nums[fast]);
                fast--;
            }else {
                res[i] = (nums[low] * nums[low]);
                low++;
            }
        }
        return res;
    }
}
