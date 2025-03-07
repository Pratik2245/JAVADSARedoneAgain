public class LeetCode_704BinarySearch {
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int target = 9;
       int res= search(arr,target);
        System.out.println(res);
    }
    public static int search(int[] nums, int target) {
      int start=0;
      int end=nums.length-1;
      while (start<=end){
          int mid=start+(end-start)/2;
          if(nums[mid]==target){
              return mid;
          } else if (nums[mid]>target) {
              end=mid-1;
          }else {
              start=mid+1;
          }
      }
      return -1;
    }
}
