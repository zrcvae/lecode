package selfTest.stackandquequ;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author zrc
 * @date 2023/07/16
 * 前K个高频元素（使用小顶堆的思想）
 */
public class Test3 {
    public int[] topKFrequent(int[] nums, int k) {
        // map中的key和value分别存储元素值个出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 在优先队列中存储二元组(num,cnt),cnt表示元素值num在数组中的出现次数
        //    最大优先队列： 可以获取并删除队列中最大的值(pair1[1]-pair2[1]) 输出顺序是1，2，3，4
        //    最小优先队列： 可以获取并删除队列中最小的值(pair2[1]-pair1[1])输出顺序是4，3，2，1
        // 利用小顶堆的思想排序map中的元素，队列中每次弹出最小次数的那个
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2)->pair1[1]-pair2[1]);
        // 遍历map的集合
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (pq.size() < k){
                pq.add(new int[]{
                        entry.getKey(), entry.getValue()
                });
            }else {
                // 当出现的次数大于小顶堆中最小的那个，就弹出最小的数值，插入新数
                if (entry.getValue() > pq.peek()[1]){
                    pq.poll();
                    pq.add(new int[]{
                            entry.getKey(), entry.getValue()
                    });
                }
            }
        }
        // 创建一个新数组，依次插入数值
        int[] res = new int[k];
        // 依次弹出小顶堆,先弹出的是堆的根,出现次数少,后面弹出的出现次数多
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
