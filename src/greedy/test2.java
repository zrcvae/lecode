package greedy;
// 买卖股票的最佳时机 II
public class test2 {
    public int maxProfit(int[] prices) {
        int res = 0;
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            // 每次取插值为正的数，就是利润的最大值
            count = prices[i] - prices[i - 1];
            if (count > 0){
                res += count;
            }
        }
        return res;
    }
}
