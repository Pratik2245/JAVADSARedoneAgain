public class Day2_MoveAllZerosToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,1};
        pushZerosToEnd(arr);
    }
    public static void pushZerosToEnd(int[] arr) {
//        int i=0,j=0;
//        while (i<arr.length){
//            if(arr[i]!=0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j++;
//            }
//            else{
//                i++;
//            }
//        }
//        another solution
        int j=0;
        for (int k = 0; k <arr.length ; k++) {
            if(arr[k]!=0)
                arr[j++]=arr[k];
        }
        while (j<arr.length)
            arr[j++]=0;
        for (int k = 0; k <arr.length ; k++) {
            System.out.println(arr[k]);
        }
    }


}
