import java.util.Arrays;

public class LeetCode_1929ConcatenationOfArray {
    public static void main(String[] args) {
//    int arr[]={1,2,1};
    int arr[]={1,3,2,1};
    int arr2[]=ConacateArray(arr);
    System.out.println(Arrays.toString(arr2));
    }
    public static int[] ConacateArray(int arr[]){
        int newArr[]=new int[arr.length*2];
        int n=arr.length;
        for (int i = 0; i <arr.length; i++) {
            newArr[i]=arr[i];
            newArr[i+arr.length]=arr[i];
        }
        return newArr;
    }
}
