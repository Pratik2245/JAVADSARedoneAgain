public class LeetCode_1295FindTheNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int arr[]={555,901,482,1771};
        int result= findNumbers(arr);
        System.out.println(result);
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int result=countDigits(nums[i]);
            if(result%2==0){
                count+=1;
            }
        }
//        now optimised approach
//        for (int num:nums){
//            if(String.valueOf(num).length()%2==0){
//                count+=1;
//            }
//        }
        return count;
    }
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10; // Remove the last digit
            count++;    // Increase the count
        }
        return count;
    }



}
