package dsaQuestionsByAmazonGoogleFacebook;


public class leet_34_FindOutFirstAndLastndex {
    public static void main(String[] args) {
   int[] nums={5,7,7,7,7,8,8,10};
   int target=11;
   int[] ans= searchRange(nums, target);
        System.out.println("1="+ans[0]+" 2="+ans[1]);
    }
    public static int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    public static int search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;//gives 9
        int mid = 0;
        while (start<=end){
            mid=(start+end)/2;
            if (nums[mid] == target) {
//                updating ans value after matching of the mid
                ans=mid;
                if (findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end=mid-1;
            }
        }
//        System.out.println(ans);
    return ans;

    }

}
