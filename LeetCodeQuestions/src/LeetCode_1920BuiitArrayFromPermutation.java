import java.util.Arrays;

public class LeetCode_1920BuiitArrayFromPermutation {
    public static void main(String[] args) {
//        int arr[]={0,2,1,5,3,4};
        int arr[]={5,0,1,2,3,4};
        int newArr[]=builtArrayFromPermutation(arr);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] builtArrayFromPermutation(int arr[]){
        int newArr[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            newArr[i]=arr[arr[i]];
        }
        return newArr;
    }
}
