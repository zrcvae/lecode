package array;

public class test3 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 3;
        Soultion soultion = new Soultion();
        System.out.println(soultion.searchRange(nums, target).toString());

    }
}
class Soultion{
    int[] searchRange(int[] nums, int targe){
        int leftBorder = getLeftBorder(nums, targe);
        int rigthBorder = getRightBorder(nums, targe);
        if (leftBorder == -2 || rigthBorder == -2) return new int[]{-1, -1};
        if (rigthBorder - leftBorder > 1)return new int[]{leftBorder + 1, rigthBorder - 1};
        return new int[]{-1, -1};

    }
    int getRightBorder(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2; //没有赋值
        while (left <= right){
            int mid = left + ((right - left) / 2);
            if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid +1;
                rightBorder = left;
            }
        }
        return rightBorder;
    }
    int getLeftBorder(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2; //没有赋值
        while (left <= right){
            int mid = left + ((right - left) / 2);
            if (nums[mid] >= target){
                right = mid - 1;
                leftBorder = right;
            }else {
                left = mid +1;
            }
        }
        return leftBorder;
    }

}
