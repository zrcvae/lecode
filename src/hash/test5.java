package hash;

import java.util.HashMap;
import java.util.Map;

public class test5 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        int count = 0;
        for (int i : nums1){
            for (int j : nums2){
                temp = i + j;
                if (map.containsKey(temp)){
                    map.put(temp, map.get(temp) + 1);
                }else {
                    map.put(temp, 1);
                }
            }
        }
        for (int i : nums3){
            for (int j : nums4){
                temp = 0 - (i + j);
                if (map.containsKey(temp)){
                    count += map.get(temp);
                }
            }
        }
        return count;

    }
}
