package huisu;

import java.util.ArrayList;
import java.util.List;

public class test7 {
    private List<Integer> path = new ArrayList<>();
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backTrack(nums, 0);
        return res;

    }
    private void backTrack(int[] nums, int start){
        if (path.size() > 1){
            res.add(new ArrayList<>(path));
        }
        int[] used = new int[201];
        for (int i = start; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) ||
                    (used[nums[i] + 100]) == 1){
                continue;
            }
            used[nums[i] + 100] = 1;
            path.add(nums[i]);
            backTrack(nums, i + 1);
            path.remove(path.size() - 1);

        }

    }
}
