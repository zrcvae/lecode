package stackandqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*Comparator接口说明:
 * 返回负数，形参中第一个参数排在前面；返回正数，形参中第二个参数排在前面
 * 对于队列：排在前面意味着往队头靠
 * 对于堆（使用PriorityQueue实现）：从队头到队尾按从小到大排就是最小堆（小顶堆），
 *                                从队头到队尾按从大到小排就是最大堆（大顶堆）--->队头元素相当于堆的根节点
 * */
public class test7 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0 ) + 1);  // map.getOrDefault(num, 0 ) + 1
        }

        // 小顶堆
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) ->pair1[1] - pair2[1]);
        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            if (pq.size() < k){
                pq.add(new int[]{
                        entry.getKey(), entry.getValue()
                });
            }else {
                if (entry.getValue() > pq.peek()[1]){
                    pq.poll();
                    pq.add(new int[]{
                            entry.getKey(), entry.getValue()
                    });
                }
            }
        }
        int[] res = new int[k];
        for (int i = k - 1; i >=0; i--){
            res[i] = pq.poll()[0];
        }
        return res;

    }
}
