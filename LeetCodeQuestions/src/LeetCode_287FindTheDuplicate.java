import java.util.ArrayList;
import java.util.List;

public class LeetCode_287FindTheDuplicate {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1,1};
        List<Integer> l=new ArrayList<>();
        l=findTheDuplicate(arr);
        System.out.println(l);
    }
    static List<Integer> findTheDuplicate(int arr[]){
        List<Integer> l=new ArrayList<>();
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
        for (int j= 0;  j <arr.length;  j++) {
            if(arr[j]!=j+1){
                l.add(arr[j]);
            }
        }
        return l;
    }
}
