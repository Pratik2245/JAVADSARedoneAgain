import java.util.ArrayList;
import java.util.List;

public class LeetCode_645SetMismatch {
    public static void main(String[] args) {
        int arr[]={2,2};
        int[] res=new int[2];
        res=findTheDuplicate(arr);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }
    static int[] findTheDuplicate(int arr[]){
        int i=0;
        int correct;
        while (i<arr.length){
            correct=arr[i]-1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        int[] result=new int[2];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
              return  new int[]{arr[j],j+1};
            }
        }
        return null;
    }
}
