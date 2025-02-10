package ClassWork;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MissingElementInArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4};
       int ans= MissingElement(arr);
        System.out.println(ans);
    }
    public static int MissingElement(int arr[]){
        int i=0;
        while (i<arr.length){
            int index=arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }else {
                i++;
            }
        }
        for (int j=0;j<arr.length;j++) {
            if(j+1!=arr[j]){
                return j+1;
            }
        }
        return arr.length+1;
    }
}
