import java.sql.Array;

public class SelectionSort {
    public static void main(String[] args) {
        //selection sort
        int arr[]={34,2,1,56,78,43,4};
//        for (int i=0;i<arr.length-1;i++){
//            int smallest=i;
//            for (int j = i+1; j <arr.length ; j++) {
//             if(arr[smallest] > arr[j]){
//                 smallest=j;
//             }
//            }
//             int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//        }
//        System.out.println(Array.);

        for (int i = 0; i <arr.length ; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
