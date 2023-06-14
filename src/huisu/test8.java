package huisu;

import java.util.ArrayList;
import java.util.List;

public class test8 {
    private List<Integer> path = new ArrayList<>();
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length - 1];
        backTrack(nums, used);
        return res;

    }
    private void backTrack(int[] nums, boolean[] used){
        if (path.size() == used.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] ==true){
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backTrack(nums, used);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
