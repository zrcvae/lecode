package hash;

import java.util.HashSet;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : nums1){
            set1.add(i);
        }
        //遍历数组2进行判断
        for (int i : nums2){
            if (set1.contains(i)){
                result.add(i);
            }
        }

        //将结果集合转为数组
       return result.stream().mapToInt(x -> x).toArray();
    }
}
