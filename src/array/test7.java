package array;

import java.util.Arrays;

public class test7 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));

    }
    public static int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int start = 0;//循环开始节点
        int count = 1;//开始数
        int loop = 0;//控制循环次数
        int i, j;
        while (loop++ < n / 2 ){
            //上面从左到右
            for(j = start; j < n - loop; j++ ){
                res[start][j] = count++;
            }

            //右侧从上到下
            for(i = start; i < n - loop; i++){
                res[i][j] = count++;
            }

            //下面从右到左
            for(; j >= loop; j--){
                res[i][j] = count++;
            }

            //左侧从下到上
            for(; i >= loop; i--){
                res[i][j] = count++;
            }
            start++;
        }
        if(n % 2 == 1){
            res[start][start] = count;
        }
        return res;
    }
}
