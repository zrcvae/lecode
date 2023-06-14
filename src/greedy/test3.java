package greedy;
// 跳跃游戏
public class test3 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        // 只考虑覆盖范围
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(i + nums[i], cover);
            if (cover >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
