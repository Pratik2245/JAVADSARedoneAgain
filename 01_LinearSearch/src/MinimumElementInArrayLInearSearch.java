public class MinimumElementInArrayLInearSearch {
    public static void main(String[] args) {
        int arr[]={0,2,3,4,5,6,7,8,9,1};
        minElement(arr);
        maxElement(arr);
    }
    public static  void minElement(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                int temp=min;
                min=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("minimum element is="+min);
    }
//    program to find maximum element in array
    public static  void maxElement(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("maximum element is="+max);
    }
}
