public class LeetCode_136SingleNumber {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        int ans=singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        //   here we can use bitwise operators
        int count=0;
        for( int x:nums){
            count^=x;
        }
        return count;
    }
}
