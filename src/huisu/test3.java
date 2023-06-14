package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test3 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length == 0){
            res.add(path);
            return res;
        }
        Arrays.sort(nums);
        used = new boolean[nums.length];
        subsetsWithDupHelper(nums, 0);
        return res;

    }

    private void subsetsWithDupHelper(int[] nums, int startIndex) {
        res.add(new ArrayList<>(path));
        if (startIndex > nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length ; i++) {
            if(i > 0 && nums[i] == nums[i -1] && !used[i - 1]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            subsetsWithDupHelper(nums, i + 1);
            path.removeLast();
            used[i] = false;

        }
    }
}
