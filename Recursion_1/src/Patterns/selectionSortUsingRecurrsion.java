package Patterns;

import com.sun.security.jgss.GSSUtil;

public class selectionSortUsingRecurrsion {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        selectionSort(arr,0,1,0);
        printArray(arr);
    }
    public static void selectionSort(int arr[],int row,int col,int i){
        if(row==arr.length-1){
            return;
        }
        if(col<=arr.length-1) {
            if (arr[i] > arr[col]) {
                i=col;
            }

            selectionSort(arr,row,col+1,i);

        }else{
            int temp = arr[row];
            arr[row] = arr[i];
            arr[i] = temp;
//            increment beacuse min is 0 then move to 1 then 2 like that
            selectionSort(arr,row+1,row+2,row+1);
        }
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
