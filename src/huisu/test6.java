package huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 子集问题
public class test6 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, 0);
        return res;
    }
    private void backTrack(int[] nums, int start){
        res.add(new ArrayList<>(path));
        if (start >= nums.length){
            return;
        }
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backTrack(nums, i + 1);
            path.removeLast();
        }

    }
}
