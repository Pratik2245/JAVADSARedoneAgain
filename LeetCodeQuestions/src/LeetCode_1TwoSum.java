public class LeetCode_1TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] sum=twoSum(nums,target);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[] { j - i, j };
                }
            }
        }
        return new int[] {};
    }
}