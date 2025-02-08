public class Day4_RotateArray {
    public static void main(String[] args) {
        int d=9;
        int arr[]={1,2,3,4,5,6,7};
        RotateArray(arr,d);
    }
    public static  void reverse(int arr[],int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void RotateArray(int arr[],int d){
//        int i,j;
//        while (d>0){
//          i=0;j=i+1;
//          while (i<j && j<arr.length){
//              int temp=arr[i];
//              arr[i]=arr[j];
//              arr[j]=temp;
//              i++;
//              j++;
//          }
//          d--;
//
//        }
      d=d%arr.length;
      reverse(arr,0,d-1);
      reverse(arr,d,arr.length-1);
      reverse(arr,0,arr.length-1);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

}
