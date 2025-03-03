import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_1389CreateATargetArrayWithGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
       int arr[]= createTargetArray2(nums,index);
        System.out.println(Arrays.toString(arr));
        int arr2[]=createTargetArray(nums,index);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
            int n = nums.length;
            int[] result = new int[n];

            // Fill result with -1 initially to distinguish empty spaces
            for (int i = 0; i < n; i++) {
                result[i] = -1;
            }

            for (int i = 0; i < n; i++) {
                int insertPos = index[i];
                // Shift elements to the right to make space
                for (int j = n - 1; j > insertPos; j--) {
                    result[j] = result[j - 1];
                }
                result[insertPos] = nums[i]; // Insert the number at the correct position
            }
            return result;
        }

    public  static int[] createTargetArray2(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int result[]=new int[list.size()];
        int index1=0;
        for(int i:list){
            result[index1++]=i;
        }
        return result;
    }

}
