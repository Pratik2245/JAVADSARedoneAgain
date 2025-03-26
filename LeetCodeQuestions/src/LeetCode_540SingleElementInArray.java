public class LeetCode_540SingleElementInArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        int ans=singleNonDuplicate(arr);
        System.out.println(ans);
    }
    public static int singleNonDuplicate(int[] nums) {
//        int ans=0;
//        for (int i = 0; i < nums.length; i++) {
//            ans^=nums[i];
//        }
//        return ans;
        int left=0,right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                left=mid+2;
            }else{
                right=mid;
            }
        }
        return  nums[left];
    }
}
