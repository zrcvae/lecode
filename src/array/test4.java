package array;

public class test4 {
    public static void main(String[] args) {
        int numl[] = {3, 2, 2, 3};
        int val = 3;
        int n =removeElement(numl, val);
        System.out.println(n);


    }
    public static int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for(int fastIndex = 0; fastIndex < nums.length; fastIndex++){
            if (nums[fastIndex] != val){
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
