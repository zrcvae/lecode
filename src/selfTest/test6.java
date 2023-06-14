package selfTest;
// 移除数组中的元素，返回数组长度
public class test6 {
    public int removeElement(int[] nums, int val) {
        int low = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[low++] = nums[i];
            }
        }
        return low;
    }
}
