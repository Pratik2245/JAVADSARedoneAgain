public class LeetCode_88RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        int ans=removeDuplicates(arr);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
//        if(nums.length==0) return 0;
//        int count=1;
//        int i=1;
//        while( i<nums.length){
//            if(nums[i]==nums[count-1]){
//                i++;
//            }else if(nums[i]!=nums[count-1]){
//                nums[count]=nums[i];
//                count++;
//            }
//        }
//        return count;
        //or
        if(nums.length==0) return 0;
        int count=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[count-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
