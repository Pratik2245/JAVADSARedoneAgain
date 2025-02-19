import java.util.Arrays;

public class Leetcode_167TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target=15;
        int newArr[]=TwoSum(arr,target);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] TwoSum(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
