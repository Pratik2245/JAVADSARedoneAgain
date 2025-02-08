package ClassWork;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MissingElementInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
       int ans= MissingElement(arr);
        System.out.println(ans);
    }
    public static int MissingElement(int arr[]){
        int i=0;
        while (i<arr.length){
            int index=arr[i];
            if(arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }else {
                i++;
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
        return -1;
    }
}
