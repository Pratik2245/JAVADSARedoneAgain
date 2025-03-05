public class LeetCode_1295FindTheNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int arr[]={555,901,482,1771};
        int result= findNumbers(arr);
        System.out.println(result);
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        int calculatedCount=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            while (temp!=0){
                int digit=temp%10;
                calculatedCount+=1;
                temp=temp/10;
            }
            if(calculatedCount%2==0){
                count+=1;
            }
        }
        return count;
    }
}
