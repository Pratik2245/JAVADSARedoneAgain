public class inserionSort {
    public static void main(String[] args) {
     int arr[]={5,3,2,16,7};
     insertionSorting(arr);
    }
    public static void insertionSorting(int[] arr){
//        System.out.println(arr.length);//means all elements
//        for (int i = 0; i < arr.length-1; i++) {//will run till 16
//            for (int j = i+1; j >0 ; j--) {
//                if(arr[j]<arr[j-1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }else{
//                    break;
//                }
//            }
//        }
//        System.out.println("Sorted elements are=");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
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
        System.out.println("Sorted elements are=");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
