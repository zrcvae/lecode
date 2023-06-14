package selfTest;
// 二分查找
public class test5 {
    public static void main(String[] args) {
        int[] n = {-1,0,3,5,9,12};
        test5 t = new test5();
        int res = t.search(n, 2);
        System.out.println(res);
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int x = (end + start) / 2;
            if (target > nums[x]){
                start = x + 1;
            }else if (target < nums[x]){
                end = x - 1;
            }else{
                return x;
            }
        }
        return -1;

    }

}
