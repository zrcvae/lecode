package selfTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// 给定两个数组，编写一个函数来计算它们的交集
public class test17 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 这里注意使用set来去重
        Set<Integer> n1 = new HashSet();
        Set<Integer> res = new HashSet();
        for (int i : nums1){
            n1.add(i);
        }
        // 将数组nums2中数和n1中收集的数字对比,如果相同就放入到结果集合中
        for (int i : nums2){
            if (n1.contains(i)){
                res.add(i);
            }
        }
        // 定义一个数组，大小为res长度，在这里定义可以控制数组的长度
        // (如果这里不新建一个数组，就需要将集合转为数组)
        // return resSet.stream().mapToInt(x -> x).toArray(); 
        int[] result = new int[res.size()];
        int j = 0;
        for (int i : res){
            result[j++] = i;
        }
        return result;
    }
}
