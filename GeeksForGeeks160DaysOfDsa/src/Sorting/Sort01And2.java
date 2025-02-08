package Sorting;

public class Sort01And2 {
    public static void main(String[] args) {
        int arr[]={0, 1, 2, 0, 1, 2};
        sort012(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void sort012(int[] arr) {
        int i,j;
        int key;
        for (i = 1; i < arr.length; i++) {
            key=arr[i];
            j=i-1;
            while (j>0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
