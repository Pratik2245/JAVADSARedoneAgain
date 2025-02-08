public class LeetCode_35SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=7;//2 7
     int ans= searchInsert(arr,target);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
    int i=0;
    while (i<nums.length){
    if(nums[i]==target){
        return i;
    } else if (nums[i]>target) {
        return i;
    }else {
        i++;
    }
    }
    return nums.length;
    }
}
