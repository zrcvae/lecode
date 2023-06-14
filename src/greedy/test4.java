package greedy;

import java.util.Map;

// 跳跃游戏Ⅱ
public class test4 {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int cur = 0;  // 当前最大覆盖区域
        int next = 0;  // 最大覆盖区域
        int res = 0;  // 跳跃次数
        for (int i = 0; i <= nums.length; i++) {
            next = Math.max(i + nums[i], next);
            if (i == cur){
                if (cur < nums.length - 1){
                    res++;
                    cur = next;
                    if (cur >= nums.length - 1){
                        break;
                    }
                }else {
                    break;
                }
            }
        }
        return res;
    }
}
